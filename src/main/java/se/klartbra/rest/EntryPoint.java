package se.klartbra.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/profiles")
public class EntryPoint {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ElementManagerProfile getAllProfiles() {
		return new ElementManagerProfile("em1", 22);
	}

	@GET
	@Path("{platform}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getProfile(@PathParam("platform") String platformName) {
		return "Profiles for platform: "+ platformName;
	}
	
	@PUT
	@Path("/add")	
	@Consumes(MediaType.APPLICATION_JSON)
	public Response provision(ProfileData profileData) {
		String result = "Got data: "+ profileData;
		return Response.status(201).entity(result).build();
	}
	
	
}
