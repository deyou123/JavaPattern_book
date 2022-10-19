package jdp3e.visitor.implementation_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Employee.java

abstract class Employee {
	protected String name;
	protected String designation;
	//protected int subordinatesCount;
	protected List<Employee> subordinates;
	// New field for this example.
	// It is tagged with "final", so a visitor cannot modify it.
	protected final double experience;

	// Constructor
	public Employee(String name, String designation, double experience) {
		this.name = name;
		this.designation = designation;
		//this.subordinatesCount = 0;
		this.experience = experience;
		subordinates = new ArrayList<Employee>();
	}

	protected abstract void printStructures();

	protected abstract void addEmployee(Employee e);

	protected abstract void removeEmployee(Employee e);

	// Gets the years of experience
	public double getExperience() {
		return experience;
	}

	// Get the name of employee
	public String getName() {
		return name;
	}
	public Collection<Employee> getSubordinates(){
		return Collections.emptyList();
	}

	public abstract void acceptVisitor(Visitor visitor);

}
