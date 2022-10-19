package jdp3e.iterator.implementation_1;

class ArtsDepartment implements Department{
	
	private String[] subjects;

	public ArtsDepartment() {
		subjects = new String[] { "1. English", "2. History", "3. Geography", "4. Psychology" };
	}

	public Iterator createIterator() {
		return new ArtsIterator(subjects);
	}
}
