package cadit.edu.animal;

public class Cat extends Feline implements Pet {

	public void welcomeMaster() {
		System.out.println(cry());

	}

	@Override
	public String cry() {
		return "Miao";
	}
	
	@Deprecated
	public void m1()
	{}

}
