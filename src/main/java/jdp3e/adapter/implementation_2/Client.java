package jdp3e.adapter.implementation_2;

class Client {

	public static void main(String[] args) {
		System.out.println("***Class Adapter Demo.***\n");
		
		RectInterface rectangle = new Rectangle();
        System.out.println("Initially, printing the details of both shapes.\n");
        System.out.println("The rectangle.AboutMe() says:");
        rectangle.aboutMe();
        
        TriInterface triangle = new Triangle();
        System.out.println("The triangle.Triangle() says:");
        triangle.aboutTriangle();

        System.out.println("\nNow using the adapter.");
        RectInterface adapter = new Adapter();        
        System.out.println("The adapter.aboutMe() says:");
        adapter.aboutMe();  
        
        //2-way adapter
        System.out.println("\nTesting a two-way adapter.");
        Adapter adapter2 = new Adapter();  
        showAdapter(adapter2);
        showAdaptee(adapter2);

	}

	private static void showAdapter(RectInterface adapter) {
		adapter.aboutMe();
		
	}
	private static void showAdaptee(TriInterface adaptee) {
		adaptee.aboutTriangle();		
	}

}
