package se.klartbra.restImpl;

import se.klartbra.framework.rest.AbstractRestApplication;

public class ProfilerApplication extends AbstractRestApplication {

	public static String applicationName = "provisioning";
	public static int port = 8080;

	public ProfilerApplication() throws Exception {
		startRestApplication(applicationName, port, EntryPoint2.class.getCanonicalName());
	}
}
