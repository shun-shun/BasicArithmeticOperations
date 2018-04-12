package testSerializable;

import java.io.Serializable;

public class Language implements Serializable{

	static final long serialVersionUID = 42L;

	private String name;

	private String type;

	public Language(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type セットする type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Language [name=");
		builder.append(name);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}


}
