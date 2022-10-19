package jdp3e.simplefactory;

class Tiger implements Animal
{
    public Tiger(){
    	System.out.println("\nA tiger is created.");
    }
    public void displayBehavior()
    {
    	System.out.println("Tiger says: Halum.");
    	System.out.println("It loves to roam in a jungle.");
    }
}
