package jdp3e.observer.implementation_1;

//Observer type-2: These are customers

class Customer implements Observer {
	String nameOfObserver;

	public Customer(String name) {
		this.nameOfObserver = name;
	}

	@Override
	public void getNotification(Company company) {
		System.out.print(nameOfObserver + " is notified from " +company.getName());
		System.out.println("Its current stock price is:$" + company.getStockPrice());
		
	}
	@Override
	public String getObserverName() {
		return nameOfObserver;		
	}
}