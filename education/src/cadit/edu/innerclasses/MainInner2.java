package cadit.edu.innerclasses;

public class MainInner2 {

	public String x;
	
	public void outerMethod(String x)
	{
		this.x = x; 
		
	}
	
	public class InnerTest
	{
		
		public void innerMethod()
		{
			outerMethod("InnerValue");
		}
	}
	
	public static void main(String[] args) {
		MainInner2 main2 = new MainInner2();
		InnerTest t= main2.new InnerTest();
		t.innerMethod();
		System.out.println(main2.x);
	}

}
