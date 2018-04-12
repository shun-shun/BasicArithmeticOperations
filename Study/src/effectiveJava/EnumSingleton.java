package effectiveJava;

public enum EnumSingleton {
	INSTANCE;

	private String field;


	public static EnumSingleton getInstance() {
		if(INSTANCE.field == null) {
			INSTANCE.field = "hogehoge";
		}
		return INSTANCE;
	}


	/**
	 * @return field
	 */
	public String getField() {
		return field;
	}


	/**
	 * @param field セットする field
	 */
	public void setField(String field) {
		this.field = field;
	}


}
