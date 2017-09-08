package ezhie.fw.ws.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import ezhie.fw.ws.contractor.TestRestService;
import ezhie.fw.ws.message.TestResponse;

public class TestRestServiceImpl implements TestRestService {

	public TestResponse hello() {
		TestResponse example = new TestResponse();
		example.setName("sample user");
		example.setValue("sample value");
		return example;
	}

	
	@GET
	@Path("/Test")
	public String Test() {
		return "Success";
	}

}
