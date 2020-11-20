package nrsoft.edu.math;

public class MainMath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		staticVersion();
		objectVersion();

	}
	
	private static void objectVersion() {
		Factor f = new Factor();
		for(int i=0;i<=10;i++)
			System.out.println("Factorial of " + i + " is: " + f.calcWhile(i) 
					+ " = " + f.calcWhile(i) + " = " + f.calcFor(i) );
	}	

	private static void staticVersion() {
		for(int i=0;i<=10;i++)
			System.out.println("Factorial of " + i + " is: " + FactorStatic.calcWhile(i) 
					+ " = " + FactorStatic.calcWhile(i) + " = " + FactorStatic.calcFor(i) );
	}

}
