package jdp3e.singleton.implementation_5;

// ENUM Singleton

enum Captain{
	INSTANCE;
	public synchronized void getCaptain()	{ 
		System.out.println("\tYou already have a captain for your team.");
		System.out.println("\tSend him for the toss.");			
	}
}

