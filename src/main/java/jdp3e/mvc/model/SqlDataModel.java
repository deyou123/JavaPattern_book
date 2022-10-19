package jdp3e.mvc.model;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class SqlDataModel extends Model {
	 List<Employee> enrolledEmployees;
	//private LinkedList<Employee> enrolledEmployees; //Will work too.Make corresponding changes.
	
	public SqlDataModel() {
		// Adding 4 employees at the beginning.
		 enrolledEmployees = new ArrayList<Employee>();
		//enrolledEmployees = new LinkedList<Employee>();
		enrolledEmployees.add(new Employee("Amit", "E1"));
		enrolledEmployees.add(new Employee("John", "E2"));
		enrolledEmployees.add(new Employee("Sam", "E3"));
		enrolledEmployees.add(new Employee("Patrick", "E4"));
	}
   @Override
	public List<Employee> getEnrolledEmployeeDetailsFromModel() {
		return enrolledEmployees;
	}

	// Adding an employee to the model
	@Override
	public void addEmployeeToModel(Employee emp) {
		System.out.println("\nTrying to add an employee with name:"+ emp.getEmpName()+" and ID: "+emp.getEmpId());
		Employee search_emp = findEmployeeWithId(emp.getEmpId());
		if (search_emp != null) {			
			System.out.print("FAILED! Duplicate ID.");
			System.out.println(emp.getEmpId() + " is already added in the system.");
		} else {
			enrolledEmployees.add(emp);
			System.out.println(emp + " [is added now.]");
		}
	}

	// Removing an employee from model
	@Override
	public void removeEmployeeFromModel(String employeeIdToRemove) {
		System.out.println("\nTrying to remove the employee with id: " + employeeIdToRemove);
		Employee emp = findEmployeeWithId(employeeIdToRemove);
		if (emp != null) {
			System.out.println("Removing this employee.");
			enrolledEmployees.remove(emp);
		} else {
			System.out.println("At present, there is no employee with id: " + employeeIdToRemove);
			System.out.println("So, this request is ignored.");
		}
	}

	Employee findEmployeeWithId(String employeeId) {
		Employee removeEmp = null;
		for (Employee emp : enrolledEmployees) {
			if (emp.getEmpId().equals(employeeId)) {

				System.out.println(" Employee Found." + emp.getEmpName() + " has id:" + employeeId);
				removeEmp = emp;
			}
		}
		return removeEmp;
	}

}
