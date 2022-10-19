package jdp3e.iterator.implementation_3;

/**
 * This is the Employee class.
 * This class has getter methods, 
 * but no setter methods.
 */

class Employee {
	private String name;
	private int id;
	private double salary;

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	/*
	 * public void setName(String name) { this.name = name; }
	 */

	public int getId() {
		return id;
	}

	/*
	 * public void setId(int id) { this.id = id; }
	 */

	public double getSalary() {
		return salary;
	}

	/*
	 * public void setSalary(double salary) { this.salary = salary; }
	 */

	@Override
	public String toString() {
		return "Employee Name: " + this.getName() + ", ID: " + this.getId() + " and salary: $" + this.getSalary();
	}
}
