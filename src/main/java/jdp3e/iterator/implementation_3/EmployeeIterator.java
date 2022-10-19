package jdp3e.iterator.implementation_3;

import java.util.Iterator;
import java.util.LinkedList;

class EmployeeIterator implements Iterator<Employee> {
	private LinkedList<Employee> employeeList;
	private int currentPointer;

	public EmployeeIterator(LinkedList<Employee> employeeList) {
		this.employeeList = employeeList;
		currentPointer = 0;
	}

	public void first() {
		currentPointer = 0;
	}

	
	public Employee currentItem() {
		return employeeList.get(currentPointer);
	}

	@Override
	public Employee next() {
		return employeeList.get(currentPointer++);
	}

	@Override
	public boolean hasNext() {
		if (currentPointer >= employeeList.size())
			return false;
		return true;
	}
}
