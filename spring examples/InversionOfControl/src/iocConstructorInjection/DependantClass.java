package iocConstructorInjection;

import main.ClassDependency;

public class DependantClass {
	ClassDependency classDependency;
	
	public DependantClass(ClassDependency classDependency)
	{
		this.classDependency = classDependency;
	}
	
	public void run()
	{
		classDependency.go();
	}

}
