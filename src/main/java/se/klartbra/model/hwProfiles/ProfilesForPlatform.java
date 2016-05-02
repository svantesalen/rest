package se.klartbra.model.hwProfiles;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement
public class ProfilesForPlatform {
	private String platformName="NO NAME";

	@XmlElement
	private Map<String, Profile> profiles = new HashMap<>();

	/**
	 * CTOR needed for serialization.
	 */
	public ProfilesForPlatform() {}

	public String getName() {
		return platformName;
	}

	public void setName(String name) {
		this.platformName = name;
	}

	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}

	public void addProfile(Profile profile) {
		if(profile==null) {
			System.out.println("###### trying to put null!");
			return;
		}
		this.profiles.put(profile.getProfileName(), profile);
	}


}
