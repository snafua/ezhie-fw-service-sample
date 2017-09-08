package ezhie.fw.hbn.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_REPOSITORYMETADATA")
public class RepositoryMetadata implements Serializable {
	private static final long serialVersionUID = -833230159500611079L;

	@Id
	@Column(name = "C_METADATAID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer metadataId;
	
	@Column(name = "C_UNIQUEID", nullable = true)
	private String uniqueId;
	
	@Column(name = "C_HASH", nullable = true)
	private String hash;
	
	@Column(name = "C_BYTESIZE", nullable = true)
	private Integer size;
	
	@Column(name = "C_MIMETYPE", nullable = true)
	private String mimeType;
	
	@Column(name = "C_CONTENT", nullable = true)
	private byte[] content;
	
	@Column(name = "C_REGDATE", nullable = true)
	private Date regDate;
	
	@Column(name = "C_TITLE", nullable = true)
	private String title;
	
	@Column(name = "C_CLASSCODE", nullable = true)
	private String classCode;
	
	@Column(name = "C_EVENTCODELIST", nullable = true)
	private String eventCodeList;
	
	@Column(name = "C_PATIENTUID", nullable = true)
	private String patientUID;

	public Integer getMetadataId() {
		return metadataId;
	}

	public void setMetadataId(Integer metadataId) {
		this.metadataId = metadataId;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getEventCodeList() {
		return eventCodeList;
	}

	public void setEventCodeList(String eventCodeList) {
		this.eventCodeList = eventCodeList;
	}

	public String getPatientUID() {
		return patientUID;
	}

	public void setPatientUID(String patientUID) {
		this.patientUID = patientUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classCode == null) ? 0 : classCode.hashCode());
		result = prime * result + Arrays.hashCode(content);
		result = prime * result + ((eventCodeList == null) ? 0 : eventCodeList.hashCode());
		result = prime * result + ((hash == null) ? 0 : hash.hashCode());
		result = prime * result + ((metadataId == null) ? 0 : metadataId.hashCode());
		result = prime * result + ((mimeType == null) ? 0 : mimeType.hashCode());
		result = prime * result + ((patientUID == null) ? 0 : patientUID.hashCode());
		result = prime * result + ((regDate == null) ? 0 : regDate.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((uniqueId == null) ? 0 : uniqueId.hashCode());
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
		if (!(obj instanceof RepositoryMetadata)) {
			return false;
		}
		RepositoryMetadata other = (RepositoryMetadata) obj;
		if (classCode == null) {
			if (other.classCode != null) {
				return false;
			}
		} else if (!classCode.equals(other.classCode)) {
			return false;
		}
		if (!Arrays.equals(content, other.content)) {
			return false;
		}
		if (eventCodeList == null) {
			if (other.eventCodeList != null) {
				return false;
			}
		} else if (!eventCodeList.equals(other.eventCodeList)) {
			return false;
		}
		if (hash == null) {
			if (other.hash != null) {
				return false;
			}
		} else if (!hash.equals(other.hash)) {
			return false;
		}
		if (metadataId == null) {
			if (other.metadataId != null) {
				return false;
			}
		} else if (!metadataId.equals(other.metadataId)) {
			return false;
		}
		if (mimeType == null) {
			if (other.mimeType != null) {
				return false;
			}
		} else if (!mimeType.equals(other.mimeType)) {
			return false;
		}
		if (patientUID == null) {
			if (other.patientUID != null) {
				return false;
			}
		} else if (!patientUID.equals(other.patientUID)) {
			return false;
		}
		if (regDate == null) {
			if (other.regDate != null) {
				return false;
			}
		} else if (!regDate.equals(other.regDate)) {
			return false;
		}
		if (size == null) {
			if (other.size != null) {
				return false;
			}
		} else if (!size.equals(other.size)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		if (uniqueId == null) {
			if (other.uniqueId != null) {
				return false;
			}
		} else if (!uniqueId.equals(other.uniqueId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "RepositoryMetadata [" + (metadataId != null ? "metadataId=" + metadataId + ", " : "")
				+ (uniqueId != null ? "uniqueId=" + uniqueId + ", " : "") + (hash != null ? "hash=" + hash + ", " : "")
				+ (size != null ? "size=" + size + ", " : "") + (mimeType != null ? "mimeType=" + mimeType + ", " : "")
				+ (content != null ? "content=" + Arrays.toString(content) + ", " : "")
				+ (regDate != null ? "regDate=" + regDate + ", " : "") + (title != null ? "title=" + title + ", " : "")
				+ (classCode != null ? "classCode=" + classCode + ", " : "")
				+ (eventCodeList != null ? "eventCodeList=" + eventCodeList + ", " : "")
				+ (patientUID != null ? "patientUID=" + patientUID : "") + "]";
	}
	
}
