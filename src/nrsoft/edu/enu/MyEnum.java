package nrsoft.edu.enu;

public enum MyEnum {
	
	CASE1("Case1"),
	CASE2("Case1"),
	CASE3("Case3");			// ; terminating list
	
	private String value1;
	
	MyEnum(String value1)
	{
		this.value1=value1;
	}

	/**
	 * @return the value1
	 */
	public String getValue1() {
		return value1;
	}
	
	
	

}
