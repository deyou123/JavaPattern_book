package jdp3e.solid_principles.without_dip;

class Client {

	public static void main(String[] args) {
		System.out.println("***A demo without DIP.***");
		UserInterface userInterface = new UserInterface();
		userInterface.saveEmployeeId("E001");	

	}

}
