package jdp3e.visitor.implementation_1;

class IncrementorVisitor implements Visitor {
	@Override
	public void visitNumber(IntegerProcessor myInt)	{
		
		System.out.println("The flag value is:"+ myInt.getNumber());
		System.out.println("Incrementing it by 10.");
		int temp=myInt.getNumber()+10;
		System.out.println("The new value is:"+ temp);
		//Remaining code, if any
	}
} 
