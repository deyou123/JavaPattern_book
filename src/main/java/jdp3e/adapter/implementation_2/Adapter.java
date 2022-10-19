package jdp3e.adapter.implementation_2;

/*
 * Adapter is implementing RectInterface.
 * So, it needs to implement all the methods 
 * defined in the target interface.
 */
class Adapter extends Triangle implements RectInterface {
	
    public void aboutMe() {
        
    	// Invoking the adaptee method
    	// For Q&A
    	//System.out.println("Using an adapter now.");
        this.aboutTriangle();
    }
}