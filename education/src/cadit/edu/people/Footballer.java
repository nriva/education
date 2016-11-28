package cadit.edu.people;

public class Footballer extends Person {
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Footballer [" + (role != null ? "role=" + role + ", " : "")
				+ (name != null ? "name=" + name + ", " : "") + "age=" + age
				+ "]";
	}

	String role;

	/**
	 * @param name
	 * @param age
	 * @param role
	 */
	public Footballer(String name, int age, String role) {
		super(name, age);
		this.role = role;
	}

	/* (non-Javadoc)
	 * @see isa.people.Person#introduce()
	 */
	@Override
	void introduce() {
		super.introduce();
		System.out.println("Gioco come " + role);
	}
	
	

}
