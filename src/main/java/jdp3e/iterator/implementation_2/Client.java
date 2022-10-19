package jdp3e.iterator.implementation_2;

import java.util.Iterator;

class Client {

	public static void main(String[] args) {

		System.out.println("***Iterator Pattern Demonstration-2.***");

		Department arts = new ArtsDepartment();

		Iterator<String> artsIterator = arts.createIterator();
		
		System.out.println("Iterating over the Arts subjects:\n");
		while (artsIterator.hasNext()) {
			System.out.println(artsIterator.next());
		}
		// Moving back to first element
		((ArtsIterator) artsIterator).first();
		
		String pointer=((ArtsIterator)artsIterator).currentItem();
		System.out.println("\nThe pointer moves to -> " + pointer);
	}

}
