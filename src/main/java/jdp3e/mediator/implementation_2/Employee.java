package jdp3e.mediator.implementation_2;

//The Employee class
class Employee {

	private ChatServer chatServer;
	protected String name;

	public String getName() {
		return name;
	}

	// Constructor
	public Employee(ChatServer chatServer, String name) {
		this.chatServer = chatServer;
		this.name = name;
		chatServer.registerEmployee(this);
	}

	public void sendMessage(Employee toEmp, String msg) throws InterruptedException {
		chatServer.postMessage(this, toEmp, msg);
	}

	public void receiveMessage(Employee fromEmp, String msg) {
		System.out.println(this.name + " has read " + fromEmp.getName() + "'s message now.");
	}

}
