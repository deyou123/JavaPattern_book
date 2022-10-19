package jdp3e.proxy.implementation_1.components;

// The ConcreteSubject class
class ConcreteSubject extends Subject {
	ConcreteSubject() {
	}

	@Override
	public void doSomeWork() {
		System.out.println("The doSomeWork() is executed.");
	}
}
