package jdp3e.null_object.implementation1;

class Bus implements Vehicle {
	public static int busCount = 0;

	public Bus() {
		busCount++;
	}

	@Override
	public void travel() {
		System.out.println("Let us travel on a bus.");
	}
}
