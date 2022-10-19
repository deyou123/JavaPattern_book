package jdp3e.mvc.view;

import java.util.List;

import jdp3e.mvc.model.Employee;

public abstract class View {
	public abstract void showEnrolledEmployees(List<Employee> enrolledEmployees);

}
