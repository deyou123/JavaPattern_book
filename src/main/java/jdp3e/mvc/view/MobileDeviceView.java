package jdp3e.mvc.view;

import java.util.List;

import jdp3e.mvc.model.Employee;
// This is added to show multiple views
public class MobileDeviceView extends View {
	@Override
	public void showEnrolledEmployees(List<Employee> enrolledEmployees)	{
		System.out.println("\n ***This is a mobile view of currently enrolled employees.*** ");
		System.out.println("Employee Id"+ "\t"+ " Employee Name");
		System.out.println("______________________");
		for( Employee employee : enrolledEmployees){
			System.out.println(employee.getEmpId() + "\t"+ employee.getEmpName());
		}
		System.out.println("++++++++++++++++++++");
	}	
}
