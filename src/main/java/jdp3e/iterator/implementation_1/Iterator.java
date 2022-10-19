package jdp3e.iterator.implementation_1;

interface Iterator {
	
	void first(); // Reset to first element

	String next(); // To get the next element

	String currentItem(); // To retrieve the current element

	boolean hasNext(); // To check the next element.
}
