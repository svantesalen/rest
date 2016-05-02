package se.klartbra.restImpl;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import se.klartbra.framework.rest.HttpMethods;
import se.klartbra.model.hwProfiles.Profile;
import se.klartbra.model.hwProfiles.ProfilesForPlatform;
import se.klartbra.model.hwProfiles.ProfilesPerPlatform;

@Path("/profiles")
public class EntryPoint2 implements HttpMethods {

	public ProfilesPerPlatform get() {
		System.out.println("# EntryPoint2:get()");
		ProfilesPerPlatform d =  new ProfilesPerPlatform();	
		ProfilesForPlatform pfp = new ProfilesForPlatform();
		pfp.addProfile(new Profile("aha"));
		d.set(new ProfilesForPlatform());
		return d;
	}

	public ProfilesForPlatform get(String hwPlatform) {
		System.out.println("# EntryPoint2:get(res)");
		ProfilesForPlatform pfp = new ProfilesForPlatform();
		pfp.addProfile(new Profile("aha"));
		return pfp;
	}

	public Response put(Profile data) {
		String result = "Got data: "+ data;
		return Response.status(201).entity(result).build();
	}
}
