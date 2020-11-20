package nrsoft.edu.innerclasses;


public class ContainerClassWithStaticInner {
	
	static int member=0;
	
//	int member = 0; // Error! Comment this line and uncomment the above to remove the error
	
	public static class InnerClass
	{
		public void incrementContainerMember()
		{
			
			member++;
		}
		
	}

}
