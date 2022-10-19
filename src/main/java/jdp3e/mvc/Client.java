package jdp3e.mvc;

import jdp3e.mvc.model.*;
import jdp3e.mvc.view.*;
import jdp3e.mvc.controller.*;

class Client {

	public static void main(String[] args) {
		System.out.println("***MVC architecture Demo***");
		// Model
		Model model = new EmployeeModel();

		// View
		View view = new ConsoleView();

		// Controller
		Controller controller = new EmployeeController(model, view);
		controller.displayEnrolledEmployees();

		// Add an employee
		Employee kevin=new Employee("Kevin", "E4");
		controller.addEmployee(kevin);
		controller.displayEnrolledEmployees();

		// Remove an existing employee using the employee id.
		controller.removeEmployee("E2");
		controller.displayEnrolledEmployees();

		// Cannot remove an employee who does not
		// belong to the registered list.
		controller.removeEmployee("E5");
		controller.displayEnrolledEmployees();

		// Avoiding duplicate entries.
		controller.addEmployee(kevin);
		controller.addEmployee(new Employee("Kate", "E4"));
		
		// Added for the Q&A Session
		view = new MobileDeviceView();
		controller = new EmployeeController(model, view);
		controller.displayEnrolledEmployees();
		
		
		// Testing a new model
		model = new SqlDataModel();
		view = new MobileDeviceView();
		controller = new EmployeeController(model, view);
		controller.displayEnrolledEmployees();
		
		

	}

}
