package ezhie.fw.hbn.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ezhie.fw.hbn.CommonHibernateDao;
import ezhie.fw.hbn.model.ConfigurationEntry;

//@Repository("configurationEntryDao")
@Component
public class ConfigurationEntryDaoImpl extends CommonHibernateDao<ConfigurationEntry> implements ConfigurationEntryDao {

	public ConfigurationEntryDaoImpl(@Autowired SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public ConfigurationEntry findByConfigurationEntryKey(int configurationEntryKey) throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		return findBy("configurationEntryId", configurationEntryKey);
	}
	

}
