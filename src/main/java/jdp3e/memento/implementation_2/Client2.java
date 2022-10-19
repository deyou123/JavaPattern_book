package jdp3e.memento.implementation_2;

import java.util.ArrayList;
import java.util.List;

/*
 * This is the caretaker class. As per GoF: 
 * 1.This class is responsible for memento's safe-keeping. 
 * 2.Never operates or Examines the content of a Memento. 
 * Additional notes( for your reference): 
 * The originator object has an internal state, and a client can set a state in it. 
 * A client(or, caretaker)
 * requests a memento from the originator to save the current internal state of
 * the originator).It can also pass a memento back to the originator to restore
 * it to a previous state that the memento holds in it. This enables to save and
 * restore the internal state of an originator without violating its
 * encapsulation.
 */

class Client2 {

	public static void main(String[] args) {
		System.out.println("***Memento Pattern Demonstration-2.***\n");

		Originator originator = new Originator();

		// This list stores the checkpoints
		List<Originator.Memento> savedMementos = new ArrayList<Originator.Memento>();
		// Snapshot #0
		saveSnapShot(originator, "Snapshot #0", savedMementos);
		// Snapshot #1
		saveSnapShot(originator, "Snapshot #1", savedMementos);
		// Snapshot #2
		saveSnapShot(originator, "Snapshot #2", savedMementos);
		// Snapshot #3
		saveSnapShot(originator, "Snapshot #3", savedMementos);
		// Snapshot #4. Taking a snapshot,
		// but not adding as a restore point.
		originator.setState("Snapshot #4");

		// Undo's
		// Roll back everything...
		System.out.println("\n\nStarted restoring process...");
		for (int i = savedMementos.size(); i > 0; i--) {
			// Get a restore point
			originator.restore(savedMementos.get(i - 1));
			// Update the list if required.
		}

		// Redo's
		System.out.println("\nPerforming redo's now.");

		// Restore starts from "Snapshot #1" now.
		for (int i = 2; i <= savedMementos.size(); i++) {
			// Get a restore point
			originator.restore(savedMementos.get(i - 1));
			// Update the list if required.
		}

		// Restoring to any specified checkpoint
		System.out.println("\nRestoring to Snapshot #1.");
		originator.restore(savedMementos.get(1));

		// Client can't create the mementos
		// and access the state
		// Memento m1=new Memento("test"); // Error, because the Memento class is not visible now
		// Originator.Memento m1 = originator. new Memento("test"); // Error, because Memento constructor is private
		// m1.state = "arbitrary state";// state is final, you cannot edit it
		// System.out.println(m1.state);	

	}

	private static void saveSnapShot(Originator originator, String checkPoint, List<Originator.Memento> savedMementos) {
		// Setting a new state
		originator.setState(checkPoint);
		// Get the current state from the
		// originator through a memento
		Originator.Memento memento = originator.getMemento();
		System.out.println(". Saving this checkpoint.");
		savedMementos.add(memento);
	}
}