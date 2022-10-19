package jdp3e.iterator.implementation_2;

import java.util.Iterator;

class ArtsIterator implements Iterator<String> {
	private String[] subjects;
	private int currentPointer;

	public ArtsIterator(String[] papers) {
		this.subjects = papers;
		currentPointer = 0;
	}

	public void first() {
		currentPointer = 0;
	}

	public String currentItem() {
		return subjects[currentPointer];
	}

	@Override
	public boolean hasNext() {
		if (currentPointer >= subjects.length)
			return false;
		return true;
	}

	@Override
	public String next() {
		return subjects[currentPointer++];
	}
}
