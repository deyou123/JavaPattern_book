package jdp3e.mediator.implementation_1;

// Employee
class Employee extends Person {
	public Employee(Mediator mediator, String name) {
		super(mediator);
		this.name = name;
	}

	@Override
	public String personType() {
		return "Employee";
	}

}
