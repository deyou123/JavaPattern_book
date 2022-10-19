package jdp3e.mediator.implementation_1;

interface Mediator {
	
	// To register an employee
	void register(Person person);	

	// To send a message from one employee to another employee
	void connectEmployees(Person fromPerson, Person toPerson, String msg) throws InterruptedException;

	// To display currently registered members.
	void displayDetail();	

}
