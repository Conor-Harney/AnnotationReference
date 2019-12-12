package main;

import main.ClassDependency;
//if you change the constructor of main.ClassDependency, 
//you can see how we pushed control away from the dependantClasses

public class Source {

	public static void main(String[] args) {
		
		System.out.println("________");
		withoutIOC.DependantClass dpcWithoutIOC = new withoutIOC.DependantClass();
		dpcWithoutIOC.run();
		System.out.println("________");
		iocConstructorInjection.DependantClass dpcIOCConstructorInjection = new iocConstructorInjection.DependantClass(new main.ClassDependency("iocConstructorInjection"));
		dpcIOCConstructorInjection.run();
		System.out.println("________");
		iocSetterInjection.DependantClass dpcIOCSetterInjection = new iocSetterInjection.DependantClass();
		dpcIOCSetterInjection.setClassDependency(new ClassDependency("dpcIOCSetterInjection"));
		dpcIOCSetterInjection.run();
		System.out.println("________");
	}
}
