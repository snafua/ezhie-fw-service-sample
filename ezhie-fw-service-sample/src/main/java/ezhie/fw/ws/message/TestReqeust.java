package ezhie.fw.ws.message;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TestReqeust")
public class TestReqeust {

	/**
	 * 
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = -6786406943554628432L;

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
