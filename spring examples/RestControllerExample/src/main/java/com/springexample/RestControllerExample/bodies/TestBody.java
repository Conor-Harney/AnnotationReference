package com.springexample.RestControllerExample.bodies;

public class TestBody {
	String strVar;
	int intVar;
	
	public TestBody()
	{
		
	}
	
	public String getStrVar() {
		return strVar;
	}

	public void setStrVar(String strVar) {
		this.strVar = strVar;
	}

	public int getIntVar() {
		return intVar;
	}

	public void setIntVar(int intVar) {
		this.intVar = intVar;
	}

	@Override
	public String toString() {
		return "TestBody [strVar=" + strVar + ", intVar=" + intVar + "]";
	}

	
	
}
