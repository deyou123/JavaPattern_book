package jdp3e.facade;

class Person {
	String name;
	double assetValue;
	boolean previousLoanExist;

	public Person(String name, double assetValue, boolean previousLoanExist) {
		this.name = name;
		this.assetValue = assetValue;
		this.previousLoanExist = previousLoanExist;
	}
}
