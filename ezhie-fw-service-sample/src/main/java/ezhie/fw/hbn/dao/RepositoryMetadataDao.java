package ezhie.fw.hbn.dao;

import org.springframework.transaction.annotation.Transactional;

import ezhie.fw.hbn.CommonHibernateDao;
import ezhie.fw.hbn.model.RepositoryMetadata;

public class RepositoryMetadataDao extends CommonHibernateDao<RepositoryMetadata> {

	@Transactional(readOnly=true)
	public RepositoryMetadata findByMetadataId(int metadataId) throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		return findBy("metadataId", metadataId);
	}

	@Transactional(readOnly=true)
	public RepositoryMetadata findByUniqueId(String uniqueId) throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		return findBy("uniqueId", uniqueId);
	}
	
	@Transactional(readOnly=false, rollbackFor=Throwable.class)
	public void save(RepositoryMetadata repositoryMetadata) {
		super.save(repositoryMetadata);
	}
}
