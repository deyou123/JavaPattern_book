package jdp3e.mediator.implementation_2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Mediator
class ChatServer {
	Text text;
	List<Employee> employees;

	public ChatServer() {
		employees = new ArrayList<Employee>();		
	}

	public void registerEmployee(Employee employee) {
		employees.add(employee);
	}

	public void registerText(Text text) {
		this.text = text;

	}

	public void displayEmployees() {
		System.out.println("At present, the registered employees are:");
		for (Employee emp : employees) {
			System.out.println(emp.getName());
		}
	}

	public void postMessage(Employee fromEmp, Employee toEmp, String msg) throws InterruptedException {
		// Include some validation logic-if necessary

		// Posting the message
		System.out.println(fromEmp.getName() + " posts: " + msg + " at:" + LocalDateTime.now());
		text.makeDefaultColor();
		toEmp.receiveMessage(fromEmp, msg);
        // Some logic (Skipped) to ensure that 
        // the message is received and read.

		text.makeBlueText();
	}

}