package nrsoft.edu.math;

public class Factor {
	
	public int calc(int n)
	{
		if(n==0 || n==1)
			return 1;
		return n*calc(n-1);
	}
	
	public int calcWhile(int n)
	{
		int r = 1;
		int i=1;
		while(i<=n)
			r *= i++;
		return r;
	}
	
	public int calcDo(int n)
	{
		int r = 1;
		int i=1;
		do
			r *= i++;
		while(i<=n);
		return r;
	}
	
	public int calcFor(int n)
	{

		int r = 1;
		for(int i=1;i<=n;i++)
			r *= i;
		return r;
	}
}
