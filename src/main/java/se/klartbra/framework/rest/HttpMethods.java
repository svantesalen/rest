package se.klartbra.framework.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import se.klartbra.model.hwProfiles.Profile;
import se.klartbra.model.hwProfiles.ProfilesForPlatform;
import se.klartbra.model.hwProfiles.ProfilesPerPlatform;

public interface HttpMethods {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ProfilesPerPlatform get();

	@GET
	@Path("{platform}")
	@Produces(MediaType.APPLICATION_JSON)
	public ProfilesForPlatform get(@PathParam("platform") String platform);

	@PUT
	@Path("/put")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response put(Profile profile);

}
