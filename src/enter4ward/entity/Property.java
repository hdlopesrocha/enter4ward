package enter4ward.entity;

public class Property {
	public class Definition {
		private String name, type;
		private boolean readOnly, mandatory;

		public Definition(String type, String name, Boolean readOnly,
				Boolean mandatory) {
			this.type = type;
			this.name = name;
			this.readOnly = readOnly;
			this.mandatory = mandatory;
		}
	}

	public Property(Property.Definition definition) {

	}

	public Object get(String key) {
		return null;
	}

	public void set(String key, Object value) {

	}

	public void add(String key, Object value) {

	}

}
