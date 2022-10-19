package jdp3e.iterator.implementation_1;

class ArtsIterator implements Iterator {

	private String[] subjects;

	private int currentPointer;

	public ArtsIterator(String[] subjects) {
		this.subjects = subjects;
		currentPointer = 0;
	}

	@Override
	public void first() {
		currentPointer = 0;
	}

	@Override
	public String next() {
		// System.out.println("Currently pointing to: "+ this.currentItem());
		return subjects[currentPointer++];
	}

	@Override
	public String currentItem() {
		return subjects[currentPointer];
	}

	@Override
	public boolean hasNext() {

		if (currentPointer >= subjects.length)
			return false;
		return true;

		// return currentPointer >= subjects.length? false: true;
	}
}
