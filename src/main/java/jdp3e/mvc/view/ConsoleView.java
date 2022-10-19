package jdp3e.mvc.view;

import java.util.List;

import jdp3e.mvc.model.Employee;

public class ConsoleView extends View {
	@Override
	public void showEnrolledEmployees(List<Employee> enrolledEmployees)	{
		System.out.println("\n ***This is a console view of currently enrolled employees.*** ");
		for( Employee employee : enrolledEmployees){
			System.out.println(employee);
		}
		System.out.println("---------------------");
	}
}
