package jdp3e.observer.implementation_2;

//Observer type-2: These are customers
class Customer implements Observer {
	String nameOfObserver;

	public Customer(String name) {
		this.nameOfObserver = name;
	}

	@Override
	public void getNotification(Company company) {
		System.out.print(nameOfObserver + " is notified from " + company.getName());
		System.out.println("It's current stock price is:$" + company.getStockPrice());

	}

	@Override
	public void registerTo(Company company) {
		company.register(this);
		System.out.println(this.nameOfObserver + " registered himself/herself to " + company.getName());

	}

	@Override
	public void unregisterFrom(Company company) {
		company.unRegister(this);
		System.out.println(this.nameOfObserver + " unregistered himself/herself from " + company.getName());

	}

	@Override
	public String getObserverName() {
		return nameOfObserver;
	}
}

