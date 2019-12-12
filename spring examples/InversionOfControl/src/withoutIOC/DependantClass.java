package withoutIOC;

import main.ClassDependency;

public class DependantClass {
	ClassDependency classDependency;
	
	public DependantClass()
	{
		this.classDependency = new ClassDependency("withoutIOC");
	}
	
	public void run()
	{
		classDependency.go();
	}

}
