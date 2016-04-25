package se.klartbra.model.hwProfiles;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("restriction")
@XmlRootElement
public class HwPlatforms {
	@XmlElement
	private Map<String, HwPlatform> hwPlatforms = new HashMap<>();
	
	/**
	 * CTOR needed for serialization.
	 */
	public HwPlatforms() {}

	/**
	 * Add a HwPlatform.s
	 * @param hwPlatform
	 */
	public void set(HwPlatform hwPlatform) {
		this.hwPlatforms.put(hwPlatform.getName(), hwPlatform);
	}

	/**
	 * Get the HwPlatform that has the name given.
	 * 
	 * @param name The given name.
	 * @return The HwPlatform for the given name.
	 */
	public HwPlatform get(String name) {
		return hwPlatforms.get(name);
	}

	
}
