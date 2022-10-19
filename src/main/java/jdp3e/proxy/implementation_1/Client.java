package jdp3e.proxy.implementation_1;
import jdp3e.proxy.implementation_1.components.*;

/**
 * The client is talking to a ConcreteSubject 
 * instance through a proxy method.
 */
class Client {

	public static void main(String[] args) {
		System.out.println("***Proxy Pattern Demo***\n");
		// ConcreteSubject has package-private visibility
		// So, you cannot make an instance of it here.		 
		// Subject cs = new ConcreteSubject();//Error
		
		Subject proxy = new ProxySubject();
		proxy.doSomeWork();
	}
}

