package ezhie.fw.ws.contractor;

import javax.jws.WebService;
import javax.xml.ws.BindingType;

import ezhie.fw.ws.message.TestReqeust;
import ezhie.fw.ws.message.TestResponse;

@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
@WebService(name="TestSoapService")
public interface TestSoapService {
	
	public TestResponse hello(TestReqeust testReq) throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException;
	
}
