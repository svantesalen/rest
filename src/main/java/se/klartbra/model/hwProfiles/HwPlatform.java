package se.klartbra.model.hwProfiles;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement
public class HwPlatform {
	private String platformName;
	private Map<String, Profile> profiles = new HashMap<>();

	/**
	 * CTOR needed for serialization.
	 */
	public HwPlatform() {}

	public String getName() {
		return platformName;
	}

	public void setName(String name) {
		this.platformName = name;
	}

	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}

//	public void setProfile(Profile profile) {
//		this.profiles.put(profile.get, value);
//	}


}
