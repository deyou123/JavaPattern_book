package jdp3e.prototype.implementation_4;

class Employee implements Cloneable {
	int id;
	String name;
	EmpAddress empAddress;

	public Employee(int id, String name, EmpAddress empAddress) {
		this.id = id;
		this.name = name;
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		String empDetail = null;
		empDetail = "Employee detail: Id: " + id + " Name: " + name + " Address: " + empAddress;
		return empDetail;
	}

	// Copy Constructor

	public Employee(Employee originalEmployee) throws CloneNotSupportedException {
		this.id = originalEmployee.id;
		this.name = originalEmployee.name;
		this.empAddress = originalEmployee.empAddress.cloneAddress();
	}
}
