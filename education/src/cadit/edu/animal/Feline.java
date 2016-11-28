package cadit.edu.animal;

public abstract class Feline {
	
	abstract String cry();
	
	public void introduce()
	{
	   System.out.println("I am a feline and " + cry());
	}


}
