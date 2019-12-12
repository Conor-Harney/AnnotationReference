package iocSetterInjection;

import main.ClassDependency;

public class DependantClass {
	ClassDependency classDependency;
	
	public DependantClass()
	{
	}
	
	public void setClassDependency(ClassDependency classDependency)
	{
		this.classDependency = classDependency;
	}
	
	public void run()
	{
		classDependency.go();
	}

}
