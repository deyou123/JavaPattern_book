package jdp3e.observer.implementation_2;

//Observer type-1: These are employees
class Employee implements Observer {
	String nameOfObserver;

	public Employee(String name) {
		this.nameOfObserver = name;
	}

	@Override
	public void getNotification(Company company) {
		System.out.print(nameOfObserver + " has received an alert from " + company.getName());
		System.out.println("The current stock price is:$" + company.getStockPrice());
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
