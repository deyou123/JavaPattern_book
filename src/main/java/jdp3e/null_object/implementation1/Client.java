package jdp3e.null_object.implementation1;
import java.util.Scanner;

class Client {

	public static void main(String[] args) {
		System.out.println("***This program demonstrates the need for a Null Object pattern.***\n");
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
					//vehicle.travel();
					break;
				case "t":
					vehicle = new Train();
					//vehicle.travel();
					break;
				case "exit":
					flag = false;
					System.out.println("Closing the application.");
					break;
				default:
					System.out.println("Invalid input.");
					vehicle=NullVehicle.getInstance();					
				}
				//There is no need to do a null check now.
				vehicle.travel();
				totalObjects = Bus.busCount + Train.trainCount +NullVehicle.nullVehicleCount;
				System.out.println("Number of objects created:" + totalObjects);
			}
		} finally {
			scanner.close();
		}
		
	}
}
