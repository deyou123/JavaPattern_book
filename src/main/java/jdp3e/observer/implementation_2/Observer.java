package jdp3e.observer.implementation_2;


interface Observer {
	void getNotification(Company company);

	void registerTo(Company company);

	void unregisterFrom(Company company);

	String getObserverName();
}
