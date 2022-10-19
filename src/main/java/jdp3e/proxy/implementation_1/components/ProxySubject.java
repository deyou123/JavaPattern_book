package jdp3e.proxy.implementation_1.components;

/**
 * This is the proxy class. 
 * It invokes the doSomeWork() from
 * the ConcreteSubject.
 */
public class ProxySubject extends Subject {
	private Subject subject;

	public ProxySubject() {
		// We create only one instance
		// of the ConcreteSubject
		if (subject == null) {
			subject = new ConcreteSubject();
		}
	}

	@Override
	public void doSomeWork() {
		System.out.println("The proxy call is happening now.");
		subject.doSomeWork();
	}
}
