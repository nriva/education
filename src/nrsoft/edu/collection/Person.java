package nrsoft.edu.collection;

public class Person implements Comparable<Person>, java.io.Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -6638107208275314784L;
	String name="";
	String surname="";
	String address="";
	int age=0;
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mi chiamo " + name + " " + surname + ", vivo in " + address +  " e ho " + age + " anni";
	}



	/**
	 * @param name
	 * @param surname
	 * @param address
	 * @param age
	 */
	public Person(String name, String surname, String address, int age) {
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.age = age;
	}



	/**
	 * @param name
	 * @param surname
	 */
	public Person(String name, String surname) {
		this(name,surname,"",0);
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (surname == null) {
			if (other.surname != null) {
				return false;
			}
		} else if (!surname.equals(other.surname)) {
			return false;
		}
		return true;
	}



	public int compareTo(Person o) {
	  int r = name.compareToIgnoreCase(o.name);
	    if (r == 0) {
		  r = surname.compareToIgnoreCase(o.surname);
	    }
	    return r;

	}




	
	

}
