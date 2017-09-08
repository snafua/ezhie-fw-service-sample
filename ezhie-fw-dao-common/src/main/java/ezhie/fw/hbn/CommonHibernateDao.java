package ezhie.fw.hbn;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public abstract class CommonHibernateDao<T> extends HibernateDaoSupport {
	
	private Class<?> persistentClass;
	
	public CommonHibernateDao() {
	}
	
	@SuppressWarnings("unchecked")
	public CommonHibernateDao(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	private Object createPersistentInstance(String fieldName, Serializable key) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Object obj = persistentClass.newInstance();
		
		Field field = persistentClass.getDeclaredField(fieldName);
		field.setAccessible(true);
		
		if(field.getDeclaredAnnotation(javax.persistence.Id.class) != null) {
			return null;
		}
		
		field.set(obj, key);
		
		return obj;
	}

	@Transactional(readOnly=true)
	public T findBy(String fieldName, Serializable key)
			throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		List<T> list = findListBy(fieldName, key);
		
		if(list.size() > 0) {
			return list.get(0);
		}
		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	public List<T> findListBy(String fieldName, Serializable key)
			throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		Object obj = createPersistentInstance(fieldName, key);
		if(obj == null) {
			return (List<T>) Arrays.asList(getHibernateTemplate().get(persistentClass, key));
		} else {
			return (List<T>) getHibernateTemplate().findByExample(createPersistentInstance(fieldName, key));
		}
	}
	
	@Transactional(readOnly=false, rollbackFor=Throwable.class)
	public void save(Object obj) {
		getHibernateTemplate().saveOrUpdate(obj);
	}

}
