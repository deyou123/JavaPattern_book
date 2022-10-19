package jdp3e.singleton.implementation_3;

class Captain {
	// Early initialization
    private static final Captain CAPTAIN_INSTANCE = new Captain();  
		// Making the constructor private
		// to prevent the use of "new"
		private Captain() {
			System.out.println("\tA new captain is elected for your team."); 
		}
		// Global point of access.
	    public static Captain getCaptain(){ 
	    	System.out.println("\tYou already have a captain for your team.");
			System.out.println("\tSend him for the toss.");
	    	return CAPTAIN_INSTANCE;
	    }
	    public static void dummyMethod(){ 
	    	System.out.println("It is a dummy method");    	
	    }    

}
