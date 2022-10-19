package jdp3e.memento;

import java.util.ArrayList;

import java.util.List;

import jdp3e.memento.implementation_1.Memento;
import jdp3e.memento.implementation_1.Originator;

/**
 * This is the caretaker class. As per GoF: 1.This class is responsible for
 * memento's safe-keeping. 2.Never operates or Examines the content of a
 * Memento. Additional notes( for your reference): The originator object has an
 * internal state, and a client can set a state in it. A client(or, caretaker)
 * requests a memento from the originator to save the current internal state of
 * the originator).It can also pass a memento back to the originator to restore
 * it to a previous state that the memento holds in it. This enables to save and
 * restore the internal state of an originator without violating its
 * encapsulation.
 */

class Client {	
	
	static Originator originator;
	static List<Memento> savedMementos;
	
	public static void main(String[] args) {
		System.out.println("***Memento Pattern Demonstration-1.***\n");

		originator = new Originator();	

		// This list stores the checkpoints
		savedMementos = new ArrayList<Memento>();
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
			// Updating the list:removing the element from saved list
			// savedMementos.remove(i - 1);
		}

		// Redo's
		System.out.println("\nPerforming redo's now.");

		// Restore starts from "Snapshot #1" now.
		for (int i = 2; i <= savedMementos.size(); i++) {
			// Get a restore point
			originator.restore(savedMementos.get(i - 1));			
		}

		// Restoring to any specified checkpoint
		System.out.println("\nRestoring to Snapshot #1.");
		originator.restore(savedMementos.get(1));

		// DISADVANTAGE: Client can create the mementos
		// and access the state if you put this class,
		// memento class and originator class in the same package
		/*
		 * memento m1 = new memento("test");// the memento constructor is not visible
		 * m1.state="arbitrary state";//cannot do this if state is final
		 * System.out.println(m1.state);
		 */

	}

	private static void saveSnapShot(Originator originator, String checkPoint, List<Memento> savedMementos) {
		// Setting a new state
		originator.setState(checkPoint);
		// Get the current state from the
		// originator through a memento
		Memento memento = originator.getMemento();
		System.out.println(". Saving this checkpoint.");
		savedMementos.add(memento);
	}
}
