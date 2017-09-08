package ezhie.fw.ws.service;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ezhie.fw.hbn.biz.TestBizService;
import ezhie.fw.ws.contractor.TestSoapService;
import ezhie.fw.ws.message.TestReqeust;
import ezhie.fw.ws.message.TestResponse;

@org.apache.cxf.interceptor.InInterceptors (interceptors = {"ezhie.fw.interceptor.TestInterceptor" })
@WebService(endpointInterface="ezhie.fw.ws.contractor.TestSoapService")
public class TestSoapServiceImpl implements TestSoapService {

//	@Resource(name="testBizService")
	@Autowired
	private TestBizService testBizService;

	@Transactional(readOnly=false, rollbackFor=Throwable.class)
	public TestResponse hello(TestReqeust testReq) throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		TestResponse testRes = new TestResponse();
		
		testBizService.executeExample();
		
		testRes.setValue(testReq.getValue() + ": transaction complete.");
		return testRes;
	}

}
