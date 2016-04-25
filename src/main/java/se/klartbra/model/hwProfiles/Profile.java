package se.klartbra.model.hwProfiles;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.*;
/**
 * Attributes and values for a HW platform.
 * @author svantesalen
 *
 */
@SuppressWarnings("restriction")
@XmlRootElement
public class Profile {
	
	@XmlElement
	private Map<String, String> data = new HashMap<>();
	
	/**
	 * CTOR. 
	 */
	public Profile() {}
	
	public void put(String attribute, String value) {
		data.put(attribute, value);
	}

	public String get(String attribute) {
		return data.get(attribute);
	}
		
	public String remove(String attribute) {
		return data.remove(attribute);
	}
}
