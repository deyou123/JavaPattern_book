package jdp3e.singleton.implementation_1;

// This class is declared as 'final'.
// So, it cannot have a subclass.
final class Captain {
//class Captain {
	private static Captain captain; 
	// Making the constructor private
	// to prevent the use of "new"
	private Captain() {}
	public static synchronized Captain getCaptain()	{ 

		// Lazy initialization
		if (captain == null) { 
			captain = new Captain();	    	 
			System.out.println("\t A new captain is elected for your team."); 
		} 
		else { 
			System.out.println("\tYou already have a captain for your team.");
			System.out.println("\tSend him for the toss.");
		} 
		return captain;	    	 
	}	
}

// We cannot extend Captain class.
// The constructor is private in this case.
// class B extends Captain{}// error