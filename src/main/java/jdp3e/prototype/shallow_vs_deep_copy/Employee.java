package jdp3e.prototype.shallow_vs_deep_copy;


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

	public Employee cloneEmployee() throws CloneNotSupportedException {
		// For the shallow Copy
		// return (Employee) this.clone();

		// For the deep copy
		Employee employee = (Employee) this.clone();
		employee.empAddress = (EmpAddress) this.empAddress.cloneAddress();
		return employee;

	}
}