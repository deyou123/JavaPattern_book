package jdp3e.adapter;
import java.util.ArrayList;
import java.util.List;

class Client {

	public static void main(String[] args) {
		System.out.println("***Adapter Pattern Demo***\n");

		// A rectangle instance
		RectInterface rectangle = new Rectangle(20, 10);
		
		// A triangle instance
		TriInterface triangle = new Triangle(20, 10);
		
		// Using the adapter for the triangle object
		RectInterface adapter = new Adapter(triangle);

		// Holding all objects inside a list
		// It helps you traverse the list in
		// an uniform way.
		List<RectInterface> rectangleObjects = new ArrayList<RectInterface>();
		rectangleObjects.add(rectangle);
		// rectangleObjects.add(triangle);//Error
		rectangleObjects.add(adapter); // No error

		System.out.println("Processing the following objects:\n");
		for (RectInterface rectObject : rectangleObjects) {
			System.out.println("Area: " + getDetails(rectObject) + " square units.\n");
		}
	}

	/*
	 * The following method does not 
	 * know whether it gets a rectangle,
	 * or a triangle through the adapter.
	 */
	static double getDetails(RectInterface rectangle) {
		rectangle.aboutMe();
		return rectangle.calculateArea();
	}

}
