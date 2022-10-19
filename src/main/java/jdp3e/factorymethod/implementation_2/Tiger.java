package jdp3e.factorymethod.implementation_2;


class Tiger implements Animal {
    public Tiger(String color){
    	System.out.println("\nA tiger with " + color+ " color is created.");
    }
    public void displayBehavior() {
    	System.out.println("It says: Halum.");
    	System.out.println("It loves to roam in a jungle.");
    }
}