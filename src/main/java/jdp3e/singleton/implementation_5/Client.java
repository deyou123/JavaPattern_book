package jdp3e.singleton.implementation_5;

class Client {

	public static void main(String[] args) {
		System.out.println("***Singleton Pattern Demo using enum type***\n");		
		Captain.INSTANCE.getCaptain();
	}
}
