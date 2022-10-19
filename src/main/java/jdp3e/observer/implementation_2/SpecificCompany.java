package jdp3e.observer.implementation_2;


class SpecificCompany extends Company {
	public SpecificCompany (String name) {
		super(name);
	}

	@Override
	void register(Observer anObserver) {
		observerList.add(anObserver);
		System.out.println(this.getName()+ " registers "+ anObserver.getObserverName());
	}

	@Override
	void unRegister(Observer anObserver) {
		observerList.remove(anObserver);
		System.out.println(this.getName()+ " unregisters "+ anObserver.getObserverName());
	}

	// Notify all registered observers.
	@Override
		public void notifyRegisteredUsers() {            
	        for(Observer observer: observerList) {
	            observer.getNotification(this);
	        }
	    }
}