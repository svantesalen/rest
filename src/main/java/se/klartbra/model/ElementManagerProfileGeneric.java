//package se.klartbra.model;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.xml.bind.annotation.*;
//
//import se.klartbra.framework.rest.DataTransferObject;
//import se.klartbra.framework.rest.DataTransferObjectGeneric;
//
//@SuppressWarnings("restriction")
//@XmlRootElement
//public class ElementManagerProfileGeneric implements DataTransferObjectGeneric{
//	@XmlElement
//	private Map<String, String> data = new HashMap<>();
//	public ElementManagerProfileGeneric() {}
//	
//	public void put(String key, String value) {
//		data.put(key, value);
//	}
//
//	public String get(String key) {
//		return data.get(key);
//	}
//	
//	public String remove(String key) {
//		return data.remove(key);
//	}
//}
