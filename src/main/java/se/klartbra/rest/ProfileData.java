package se.klartbra.rest;

public class ProfileData {
	String port;
	String vlan1;
	String vlan2;
	String speedUp;
	String speedDown;
	
	public ProfileData() {}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getVlan1() {
		return vlan1;
	}

	public void setVlan1(String vlan1) {
		this.vlan1 = vlan1;
	}

	public String getVlan2() {
		return vlan2;
	}

	public void setVlan2(String vlan2) {
		this.vlan2 = vlan2;
	}

	public String getSpeedUp() {
		return speedUp;
	}

	public void setSpeedUp(String speedUp) {
		this.speedUp = speedUp;
	}

	public String getSpeedDown() {
		return speedDown;
	}

	public void setSpeedDown(String speedDown) {
		this.speedDown = speedDown;
	}

	@Override
	public String toString() {
		return port+", "+vlan1+", "+vlan2+", "+speedDown+", "+speedUp;
	}

}
