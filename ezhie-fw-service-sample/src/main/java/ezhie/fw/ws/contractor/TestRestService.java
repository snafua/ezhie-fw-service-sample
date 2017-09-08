package ezhie.fw.ws.contractor;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ezhie.fw.ws.message.TestResponse;

@Path("/test")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public interface TestRestService {

	@GET
	@Path("/hello")
	public TestResponse hello();
}
