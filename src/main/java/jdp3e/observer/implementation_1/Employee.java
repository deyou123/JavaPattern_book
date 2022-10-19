package jdp3e.observer.implementation_1;

//Observer type-1: These are employees

class Employee implements Observer {
	String nameOfObserver;

	public Employee(String name) {
		this.nameOfObserver = name;
	}

	@Override
	public void getNotification(Company company) {
		System.out.print(nameOfObserver + " has received an alert from " +company.getName());
		System.out.println("The current stock price is:$" + company.getStockPrice());	
	}	
	
	@Override
	public String getObserverName() {
		return nameOfObserver;		
	}

}
