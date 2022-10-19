package jdp3e.mvc.controller;
import jdp3e.mvc.model.Employee;
import jdp3e.mvc.model.Model;
import jdp3e.mvc.view.View;

public abstract class  Controller {
	protected Model model;        
	protected View view;

	public Controller(Model model, View view){
		this.model = model;
		this.view = view;           
	} 
	public abstract void displayEnrolledEmployees();
	public abstract void addEmployee(Employee employee);
	public abstract void removeEmployee(String employeeId);
}
