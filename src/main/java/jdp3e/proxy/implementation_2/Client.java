package jdp3e.proxy.implementation_2;
import jdp3e.proxy.implementation_2.components.Subject;
import jdp3e.proxy.implementation_2.components.ProxySubject;

/**
 * @author V.Sarcar
 * The client is talking to a ConcreteSubject instance 
 * through a proxy method.
 */
class Client {

	public static void main(String[] args) {
		System.out.println("***Modified Proxy Pattern Demonstration.***");
		// Admin is an authorized user
		Subject proxy = new ProxySubject();
		proxy.doSomeWork("Admin");
		// Robin is an unauthorized user
		proxy.doSomeWork("Robin");	
		
	}
}


