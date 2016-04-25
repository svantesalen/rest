//package se.klartbra.framework.rest;
//
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import se.klartbra.model.ElementManagerProfile;
//
//@Path("/restful")
//public abstract class AbstractHttpGet {
//
//	@GET
//	@Path("{Resource}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public ElementManagerProfile getAllProfiles() {
//		return new ElementManagerProfile("em1", 22);
//	}
//	public String get(@PathParam("Resource") String subResources) {
//
//		return "";
//	}
//
//	@GET
//	@Path("{platform}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public String getProfile(@PathParam("platform") String platformName) {
//		return "Profiles for platform: "+ platformName;
//	}	
//}
