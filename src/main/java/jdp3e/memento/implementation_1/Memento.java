package jdp3e.memento.implementation_1;

/**
 * This is the Memento class. As per GoF: 1.A Memento object stores the snapshot
 * of Originator's internal state. 2.Ideally,only the originator that created a
 * memento is allowed to access it.
 */
public class Memento {
	 
	// package-private visibility with final keyword
    final String state;//prevents editing the state later
    // package-private visibility
	Memento(String state) {
		this.state = state;
	}
 }