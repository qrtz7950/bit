package di_collection;

import java.util.Map;

public class MapAddress {

	private Map<String, String> address;

	
	
	public MapAddress(Map<String, String> address) {
		super();
		this.address = address;
	}

	public Map<String, String> getAddress() {
		return address;
	}

	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
	
	
}
