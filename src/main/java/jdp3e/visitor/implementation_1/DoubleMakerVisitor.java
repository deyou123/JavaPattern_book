package jdp3e.visitor.implementation_1;

class DoubleMakerVisitor implements Visitor {
	@Override
	public void visitNumber(IntegerProcessor myInt)	{
		
		System.out.println("The flag value is:"+ myInt.getNumber());
		System.out.println("Multiplying it by 2.");
		int temp=myInt.getNumber() *2;
		System.out.println("The new value is:"+ temp);
		//Remaining code, if any
	}
} 