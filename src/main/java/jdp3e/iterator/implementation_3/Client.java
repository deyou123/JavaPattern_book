package jdp3e.iterator.implementation_3;

import java.util.Iterator;

class Client {

	public static void main(String[] args) {

		System.out.println("***Iterator Pattern Demonstration-3***");
		Database employeesList = new EmployeeDatabase();

		Iterator<Employee> employeeIterator = employeesList.createIterator();
		System.out.println("Iterating over the employee list:\n");

		while (employeeIterator.hasNext()) {
			System.out.println(employeeIterator.next());
		}

		// Moving back to first element
		// artsIterator.first();
		 ((EmployeeIterator) employeeIterator).first();

		Employee pointer = ((EmployeeIterator) employeeIterator).currentItem();
		System.out.println("\nThe pointer moves to -> " + pointer);

	}

}
