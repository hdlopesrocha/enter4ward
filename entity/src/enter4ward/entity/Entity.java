package enter4ward.entity;

import java.util.Map;
import java.util.TreeMap;

public class Entity {

	private Map<String, Property> properties = new TreeMap<String, Property>();

	public Property get(String key) {
		return properties.get(key);
	}

	public void set(String key, Property value) {
		properties.put(key, value);
	}



}
