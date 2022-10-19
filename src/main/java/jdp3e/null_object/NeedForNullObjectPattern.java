package jdp3e.null_object;

import java.util.Scanner;

interface Vehicle {
	void travel();
}

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

class Train implements Vehicle {
	public static int trainCount = 0;

	public Train() {
		trainCount++;
	}

	@Override
	public void travel() {
		System.out.println("Let us travel on a train.");
	}
}

class NeedForNullObjectPattern {

	public static void main(String[] args) {
		System.out.println("***This program demonstrates the need of Null Object pattern.***\n");
		String input = null;
		Vehicle vehicle = null;
		Boolean flag = true;
		int totalObjects = 0;
		Scanner scanner = new Scanner(System.in);
		try {
			while (flag) {
				System.out.println("Enter your choice( Type 'b' for Bus, 't' for Train ) ");
				input = scanner.next();
				switch (input.toLowerCase()) {
				case "b":
					vehicle = new Bus();
					vehicle.travel();
					break;
				case "t":
					vehicle = new Train();
					vehicle.travel();
					break;
				case "exit":
					flag = false;
					System.out.println("Closing the application.");
					break;
				default:
					System.out.println("Invalid input.");
					System.out.println("Using the vehicle that was created earlier.");
					if(vehicle!=null){
						vehicle.travel();
					}
				}
				//vehicle.travel();
				totalObjects = Bus.busCount + Train.trainCount;
				System.out.println("Number of objects created:" + totalObjects);
			}
		} finally {
			scanner.close();
		}
	}
}
