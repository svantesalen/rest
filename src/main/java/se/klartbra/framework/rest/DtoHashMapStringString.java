package se.klartbra.framework.rest;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.*;

@SuppressWarnings("restriction")
@XmlRootElement
public class DtoHashMapStringString {
	
	@XmlElement
	private Map<String, String> data = new HashMap<>();
	
	/**
	 * CTOR. 
	 */
	public DtoHashMapStringString() {}
	
	public void put(String key, String value) {
		data.put(key, value);
	}

	public String get(String key) {
		return data.get(key);
	}
		
	public String remove(String key) {
		return data.remove(key);
	}
}
