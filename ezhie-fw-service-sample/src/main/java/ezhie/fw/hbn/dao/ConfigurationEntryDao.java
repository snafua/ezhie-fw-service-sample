package ezhie.fw.hbn.dao;

import ezhie.fw.hbn.model.ConfigurationEntry;

public interface ConfigurationEntryDao {

	ConfigurationEntry findByConfigurationEntryKey(int configurationEntryKey)
			throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException;

}