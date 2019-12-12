package main;

public class ClassDependency {
	String var1;
	public ClassDependency(String var1)
	{
		this.var1 = var1;
	}
	
	public void go()
	{
		System.out.println(var1);
	}

}
