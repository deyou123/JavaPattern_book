package jdp3e.mediator.implementation_1;

class Client {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("***Mediator Pattern Demonstration-1.***\n");

		Mediator mediator = new ChatServer();

		Person amit = new Employee(mediator, "Amit");
		Person sohel = new Employee(mediator, "Sohel");
		Person joseph = new Outsider(mediator, "Joseph");	

		// Registering participants
		mediator.register(amit);
		mediator.register(sohel);
		mediator.register(joseph);
		
		// Displaying the participant's list
		mediator.displayDetail();

		System.out.println("Communication starts among participants...");
		amit.sendMessage(sohel, "Hi Sohel, can we discuss the mediator pattern?");
		amit.sendMessage(joseph, "Hi Joseph, how do you do?");
		sohel.sendMessage(amit, "Hi Amit. Yup, we can discuss now.");
		joseph.sendMessage(amit, "Hello, friend.");

		// Another employee-Todd.He does not register to the mediator.
		Person todd = new Employee(mediator, "Todd");

		// Todd is an employee, but not a registered user.
		// So,he cannot send a message to a registered user.
		// For the same reason, he cannot receive any
		// message from a registered user.

		todd.sendMessage(joseph, "Hello Joseph...");
		amit.sendMessage(todd, "Hello Todd...");

		// An outsider person tries to participate
		Person jack = new Outsider(mediator, "Jack");

		// This message also cannot reach Joseph, because Jack
		// is not the registered user.
		// mediator.register(jack);//Disabled in Demonstration1
		jack.sendMessage(joseph, "Hello Joseph...");

	}

}
