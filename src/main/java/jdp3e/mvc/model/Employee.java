package jdp3e.mvc.model;

// The key "data" in this application
public class Employee {
	private String empName;
	private String empId;

	public String getEmpName() {
		return empName;
	}

	public String getEmpId() {
		return empId;
	}

	public Employee(String empName, String empId) {
		this.empName = empName;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return empName + "'s employee id is: " + empId;
	}

}
