package ezhie.fw.ws.message;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TestResponse")
public class TestResponse {

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 7807088541820107701L;
	
	private String name;
	private String value;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
