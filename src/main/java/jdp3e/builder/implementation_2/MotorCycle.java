package jdp3e.builder.implementation_2;

class MotorCycle extends Vehicle{
	String brandName;
	public MotorCycle(String brandName) {
		this.brandName=brandName;
		System.out.println("\nWe are about to make a " + brandName+ " motorcycle.");
	}
}
