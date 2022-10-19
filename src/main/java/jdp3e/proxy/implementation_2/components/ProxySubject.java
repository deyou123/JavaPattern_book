package jdp3e.proxy.implementation_2.components;

import java.util.ArrayList;
import java.util.List;

/**
 * @author V.Sarcar This is the proxy class. It invokes the doSomeWork() from
 *         the ConcreteSubject.
 */
public class ProxySubject extends Subject {
	private Subject subject;
	// String[] registeredUsers;
	String currentUser;
	List<String> registeredUsers;

	// Or, simply create this mutable list in one step
	// List<String> registeredUsers=new ArrayList<String>(Arrays.asList(
	// "Admin","Rohit","Sam"));
	public ProxySubject() {

		// We need to create only one instance
		// of the ConcreteSubject.
		if (subject == null) {
			subject = new ConcreteSubject();
		}

		// Initialize the registered users:
		registeredUsers = new ArrayList<String>();
		registeredUsers.add("Admin");
		registeredUsers.add("Kate");
		registeredUsers.add("Sam");
	}

	@Override
	public void doSomeWork(String user) {
		System.out.println("\n The proxy call is happening now.");
		System.out.println(user + " wants to invoke a proxy method.");
		if (registeredUsers.contains(user)) {
			// Allow the registered user to invoke the method
			subject.doSomeWork(user);
		} else {
			System.out.println("Sorry, " + user + ", you do not have access rights.");
		}
	}

}
