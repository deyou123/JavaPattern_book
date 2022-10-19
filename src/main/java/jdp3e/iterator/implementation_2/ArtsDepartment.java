package jdp3e.iterator.implementation_2;

import java.util.Iterator;

class ArtsDepartment implements Department {

	private String[] subjects;

	public ArtsDepartment() {
		subjects = new String[] { "1. English", "2. History", "3. Geography", "4. Psychology" };
	}

	@Override
	public Iterator<String> createIterator() {
		return new ArtsIterator(subjects);
	}

}
