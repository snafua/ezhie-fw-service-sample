package ezhie.fw.hbn.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ezhie.fw.hbn.dao.ConfigurationEntryDao;
import ezhie.fw.hbn.dao.RepositoryMetadataDao;
import ezhie.fw.hbn.model.RepositoryMetadata;

//@Service("testBizService")
@Component
public class TestBizServiceImpl implements TestBizService {

	// @Resource(name="configurationEntryDao")
	@Autowired
	private ConfigurationEntryDao cdao;

	@Autowired
	private RepositoryMetadataDao rdao;

	public void executeExample() throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		RepositoryMetadata example = new RepositoryMetadata();
		example.setUniqueId("11-9");
		rdao.save(example);

		System.out.println(cdao.findByConfigurationEntryKey(2).toString());
		System.out.println(rdao.findByMetadataId(529).toString());
	};

}
