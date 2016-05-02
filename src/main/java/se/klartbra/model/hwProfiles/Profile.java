package se.klartbra.model.hwProfiles;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.*;
/**
 * Contains an attribute - value map.

 * @author svantesalen
 *
 */
@SuppressWarnings("restriction")
@XmlRootElement
public class Profile {
	String profileName="NO NAME";
	
	@XmlElement
	private Map<String, String> data = new HashMap<>();
	
	/**
	 * CTOR. 
	 */
	public Profile() {}
	public Profile(String profileName) {
		this.profileName = profileName="No name";
	}
	
	public String getProfileName() {
		return profileName;
	}
	
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	
	public String put(String attribute, String value) {
		if(value==null|| attribute==null) {
			System.out.println("###### trying to put null!");
			return "omg";
		}

		return data.put(attribute, value);
	}

	public String getAttribute(String attribute) {
		return data.get(attribute);
	}
		
	public String removeAttribute(String attribute) {
		return data.remove(attribute);
	}
}
