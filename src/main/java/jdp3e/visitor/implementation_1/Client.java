package jdp3e.visitor.implementation_1;

class Client {

	public static void main(String[] args) {
		System.out.println("***Visitor Pattern Demonstration-1***\n");		
		NumberProcessor targetInteger = new IntegerProcessor();
		System.out.println("Testing the IncrementorVisitor now.");
		Visitor visitor = new IncrementorVisitor();
		targetInteger.acceptVisitor(visitor);
		System.out.println("\nTesting the DoubleMakerVisitor now.");
		visitor = new DoubleMakerVisitor();		
		targetInteger.acceptVisitor(visitor);
	}
}
