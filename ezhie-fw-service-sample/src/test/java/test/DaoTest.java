package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import ezhie.fw.hbn.dao.ConfigurationEntryDao;
import ezhie.fw.hbn.dao.RepositoryMetadataDao;
import ezhie.fw.hbn.model.RepositoryMetadata;

public class DaoTest {

	@Autowired
	private RepositoryMetadataDao rdao;
	
	@Autowired
	ConfigurationEntryDao cdao;
	
	public String configurationEntryDao_findByConfigurationEntryKey() throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		return cdao.findByConfigurationEntryKey(2).toString();
	}
	
	public String repositoryMetadataDao_findByMetadataId() throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		return rdao.findByMetadataId(529).toString();
	}
	
	@Transactional(readOnly=false, rollbackFor=Throwable.class)
	public void repositoryMetadataDao_save() throws Exception {
		RepositoryMetadata example = new RepositoryMetadata();
		example.setUniqueId("11-5");
		rdao.save(example);
		
		//throw new Exception("test exception");
		//TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
				"classpath*:test/DaoTest.xml"
		});
		
		DaoTest daoTest = context.getBean("daoTest", DaoTest.class);
		
		System.out.println(daoTest.configurationEntryDao_findByConfigurationEntryKey());
		
//		daoTest.repositoryMetadataDao_save();
	}

}
