package jdp3e.builder.implementation_1;

class Car extends Vehicle{
	String brandName;
	public Car(String brandName) {
		this.brandName=brandName;
		System.out.println("\nWe are about to make a " + brandName+ " car.");
	}
}