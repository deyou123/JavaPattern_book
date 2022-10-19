package jdp3e.mediator.implementation_1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// ConcreteMediator
class ChatServer implements Mediator {
	
	List<Person> participants = new ArrayList<Person>();

	@Override
	public void register(Person employee) {
		participants.add(employee);
	}

	@Override
	public void displayDetail() {
		System.out.println("At present, the registered employees are:");
		for (Person person : participants) {
			System.out.println(person.getName());
		}
	}

	@Override
	public void connectEmployees(Person fromPerson, Person toPerson, String msg) throws InterruptedException {
		// Is the sender a registered user?
		if (participants.contains(fromPerson)) {
			// Is the receiver is a registered user?
			if (participants.contains(toPerson)) {
				System.out.println(fromPerson.getName() + " posts: " + msg + " at:" + LocalDateTime.now());
				Thread.sleep(1000);
				// Target receiver receives this message.
				toPerson.receiveMessage(fromPerson, msg);				
			} else {
				System.out.print(fromPerson.getName() + ", you cannot send the message to " + toPerson.getName() + ".");
				System.out.println("He/she is NOT a registered user.");
			}
		}
		// The message sender is not a registered user.
		else {
			System.out.print("\n****ALERT: Everyone.***");
			System.out.println("An " + fromPerson.personType() + ": " + fromPerson.getName()
					+ " is trying to send some messages.");
		}
	}

}
