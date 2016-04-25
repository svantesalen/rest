package se.klartbra.restImpl;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import se.klartbra.framework.rest.DtoHashMapStringString;
import se.klartbra.framework.rest.HttpMethods;
import se.klartbra.model.hwProfiles.Profiles;

@Path("/profiles")
public class EntryPoint2 implements HttpMethods {

//	public Profiles get() {
//		System.out.println("# EntryPoint2:get()");
//		DtoHashMapStringString d =  new DtoHashMapStringString();	
//		d.put("name", "svante");
//		return d;
//	}
//
//	public Profile get(String hwPlatform) {
//		System.out.println("# EntryPoint2:get(res)");
//		DtoHashMapStringString profile = new DtoHashMapStringString();
//		profile.put("resource", "Profiles for plattform: "+hwPlatform);
//		return profile;
//	}

	public Response put(DtoHashMapStringString data) {
		String result = "Got data: "+ data;
		return Response.status(201).entity(result).build();
	}

	@Override
	public DtoHashMapStringString get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DtoHashMapStringString get(String resource) {
		// TODO Auto-generated method stub
		return null;
	}
}
