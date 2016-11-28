package cadit.edu.people;

public class MainPeople {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person[] people = new Person[2];
		people[0] = new Person("Nicola",38);
		people[1] = new Footballer("Pato",25,"attaccante");
		
		
		introduceAll(people);

	}

	public static void introduceAll(Person[] people) {
		for(Person p : people)
			p.introduce();
	}

}
