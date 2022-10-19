package jdp3e.visitor.implementation_1;


class IntegerProcessor implements NumberProcessor {
	// The "flag" is final.Once initialized, 
	// it should not be changed.
	private final int number;
	public IntegerProcessor(){
		number=5;//Initial or default value
	}    
	public int getNumber(){
		return number;
	}
	@Override
	public void acceptVisitor(Visitor visitor){
		visitor.visitNumber(this);		                
	}		
}