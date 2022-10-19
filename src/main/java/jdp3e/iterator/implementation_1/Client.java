package jdp3e.iterator.implementation_1;

class Client {

	public static void main(String[] args) {
		System.out.println("***Iterator Pattern Demonstration-1***\n");
		Department arts = new ArtsDepartment();

		Iterator artsIterator = arts.createIterator();
		System.out.println("Iterating over the Arts subjects:\n");
		while (artsIterator.hasNext()) {
			System.out.println(artsIterator.next());
		}
		// Moving back to first element
		artsIterator.first();
		System.out.println("\n The pointer moves to -> " + artsIterator.currentItem());		
	}

}
