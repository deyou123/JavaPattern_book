package jdp3e.composite;

import java.util.ArrayList;
import java.util.List;

abstract class Employee {	
	protected String name;
	protected String dept;
	protected String designation;
	protected int subordinatesCount;
	protected List<Employee> subordinates;
	//Constructor
	public Employee(String name, String designation) {
		this.name = name;
		this.designation=designation;
		this.subordinatesCount=0;
		subordinates = new ArrayList<Employee>();
	}
	protected abstract void printStructures();
	protected abstract int getSubordinatesCount();
	protected abstract void addEmployee(Employee e);
	protected abstract void removeEmployee(Employee e);
}
