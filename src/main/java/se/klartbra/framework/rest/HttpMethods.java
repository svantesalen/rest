package se.klartbra.framework.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface HttpMethods {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public DtoHashMapStringString get();

	@GET
	@Path("{resource}")
	@Produces(MediaType.APPLICATION_JSON)
	public DtoHashMapStringString get(@PathParam("resource") String resource);

	@PUT
	@Path("/put")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response put(DtoHashMapStringString data);

}
