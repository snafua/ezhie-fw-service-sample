package ezhie.fw.hbn.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "TB_CONFIGURATIONENTRY")
public class ConfigurationEntry implements Serializable {
	private static final long serialVersionUID = -5381338349951181454L;

	@Id
	@Column(name = "C_CONFIGURATIONENTRYID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer configurationEntryId;
	
	@Column(name = "C_CONFIGURATIONENTRYKEY", nullable = true)
	private String configurationEntryKey;
	
	@Column(name = "C_CONFIGURATIONENTRYVALUE", nullable = true)
	private String configurationEntryValue;
	
	public Integer getConfigurationEntryId() {
		return configurationEntryId;
	}
	public void setConfigurationEntryId(Integer configurationEntryId) {
		this.configurationEntryId = configurationEntryId;
	}
	public String getConfigurationEntryValue() {
		return configurationEntryValue;
	}
	public void setConfigurationEntryValue(String configurationEntryValue) {
		this.configurationEntryValue = configurationEntryValue;
	}
	public String getConfigurationEntryKey() {
		return configurationEntryKey;
	}
	public void setConfigurationEntryKey(String configurationEntryKey) {
		this.configurationEntryKey = configurationEntryKey;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((configurationEntryId == null) ? 0 : configurationEntryId.hashCode());
		result = prime * result + ((configurationEntryKey == null) ? 0 : configurationEntryKey.hashCode());
		result = prime * result + ((configurationEntryValue == null) ? 0 : configurationEntryValue.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ConfigurationEntry)) {
			return false;
		}
		ConfigurationEntry other = (ConfigurationEntry) obj;
		if (configurationEntryId == null) {
			if (other.configurationEntryId != null) {
				return false;
			}
		} else if (!configurationEntryId.equals(other.configurationEntryId)) {
			return false;
		}
		if (configurationEntryKey == null) {
			if (other.configurationEntryKey != null) {
				return false;
			}
		} else if (!configurationEntryKey.equals(other.configurationEntryKey)) {
			return false;
		}
		if (configurationEntryValue == null) {
			if (other.configurationEntryValue != null) {
				return false;
			}
		} else if (!configurationEntryValue.equals(other.configurationEntryValue)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "ConfigurationEntry ["
				+ (configurationEntryId != null ? "configurationEntryId=" + configurationEntryId + ", " : "")
				+ (configurationEntryKey != null ? "configurationEntryKey=" + configurationEntryKey + ", " : "")
				+ (configurationEntryValue != null ? "configurationEntryValue=" + configurationEntryValue : "") + "]";
	}
}
