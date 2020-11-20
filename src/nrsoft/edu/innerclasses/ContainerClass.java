package nrsoft.edu.innerclasses;


public class ContainerClass {
	
	int member=0;
	
	public class InnerClass
	{
		public void incrementContainerMember()
		{
			
			member++;
			ContainerClass c = ContainerClass.this;
		}
		
	}

}
