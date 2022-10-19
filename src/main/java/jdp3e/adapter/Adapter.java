package jdp3e.adapter;

/*
 * Adapter is implementing RectInterface. 
 * So, it needs to implement 
 * all the methods defined 
 * in the target interface.
 */
class Adapter implements RectInterface {
	TriInterface triangle;

	public Adapter(TriInterface triangle) {
		this.triangle = triangle;
	}

	@Override
	public void aboutMe() {
		triangle.aboutTriangle();
		
	}
	
	@Override
	public double calculateArea() {
		return triangle.calculateTriangleArea();
	}
}
