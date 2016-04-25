package se.klartbra.model.hwProfiles;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.*;
/**
 * Profile per HW platform.
 * 
 * @author svantesalen
 *
 */
@SuppressWarnings("restriction")
@XmlRootElement
public class Profiles {
	
	@XmlElement
	private Map<String, Profile> profiles = new HashMap<>();
	
	/**
	 * CTOR. 
	 */
	public Profiles() {}
	
	public void put(String profileName, Profile value) {
		profiles.put(profileName, value);
	}

	public Profile get(String profileName) {
		return profiles.get(profileName);
	}
		
	public Profile remove(String profileName) {
		return profiles.remove(profileName);
	}
	public Profile remove(Profile profile) {
		return profiles.remove(profile);
	}
}
