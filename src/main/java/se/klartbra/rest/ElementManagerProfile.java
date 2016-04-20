package se.klartbra.rest;
import javax.xml.bind.annotation.*;

@SuppressWarnings("restriction")
@XmlRootElement
public class ElementManagerProfile {
	private String name;
	private int id;
	
	public ElementManagerProfile() {
		
	}

	public ElementManagerProfile(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
}
