package jdp3e.mediator.implementation_2;

class Client {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("***Mediator Pattern Demonstration-2.***\n");

		ChatServer mediator = new ChatServer();

		Employee amit = new Employee(mediator, "Amit");
		Employee sohel = new Employee(mediator, "Sohel");
		Employee kate = new Employee(mediator, "Kate");
		Text text = new Text(mediator, "black");

		// Displaying the participant's list
		mediator.displayEmployees();

		System.out.println("\nCommunication starts among participants...");
		amit.sendMessage(sohel, "Hi Sohel, can we discuss the mediator pattern?");
		sohel.sendMessage(amit, "Hi Amit. Yup, we can discuss now.");
		amit.sendMessage(kate, "Hi Kate!");
		
	}

}
