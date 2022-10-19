package jdp3e.iterator.implementation_3;

import java.util.LinkedList;

class EmployeeDatabase implements Database {
	private LinkedList<Employee> employeeList;

	public EmployeeDatabase() {
		employeeList = new LinkedList<Employee>();
		employeeList.add(new Employee("Ron", 1, 1000.25));
		employeeList.add(new Employee("Jack", 2, 2000.5));
		employeeList.add(new Employee("Sufi", 3, 3000.75));
		employeeList.add(new Employee("Jian", 4, 2550.0));
		employeeList.add(new Employee("Alex", 5, 753.83));
	}

	public EmployeeIterator createIterator() {
		return new EmployeeIterator(employeeList);
	}
}
