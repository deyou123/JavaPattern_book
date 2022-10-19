package jdp3e.singleton.implementation_2;

import jdp3e.singleton.implementation_2.Captain;

class Client {

	public static void main(String[] args) {
		System.out.println("***Singleton Pattern Demo***\n");		
		System.out.println("Trying to make a captain for your team.");
		// Constructor is private.We cannot use "new" here.
		// Captain captain = new Captain();//error
		Captain captain1 = Captain.getCaptain();		
		System.out.println("Trying to make another captain for your team:");
		Captain captain2 = Captain.getCaptain();
		if (captain1 == captain2){ 
			System.out.println("Both captain1 and captain2 are the same."); 
		}		
		Captain.CaptainDerived derived1=captain1.new CaptainDerived();
		Captain.CaptainDerived derived2=captain1.new CaptainDerived();

	}

}
