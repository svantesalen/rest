package se.klartbra.model.hwProfiles;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Data structure that may contain profiles for several/all HW platforms.
 * @author svantesalen
 *
 */
@SuppressWarnings("restriction")
@XmlRootElement
public class ProfilesPerPlatform {
	@XmlElement
	private Map<String, ProfilesForPlatform> hwPlatforms = new HashMap<>();
	
	/**
	 * CTOR needed for serialization.
	 */
	public ProfilesPerPlatform() {}

	/**
	 * Add profiles for a platform.
	 * @param profiles All profiles for a platform.
	 */
	public void set(ProfilesForPlatform profiles) {
		if(profiles==null) {
			System.out.println("###### trying to put null!");
			return;
		}

		if(profiles.getName()==null) {
			System.out.println("###### trying to put null!");
			return;
		}

		this.hwPlatforms.put(profiles.getName(), profiles);
	}

	/**
	 * Get all profiles for a given platform.
	 * @param platformName The given name.
	 * @return The profiles.
	 */
	public ProfilesForPlatform get(String platformName) {
		return hwPlatforms.get(platformName);
	}

	
}
