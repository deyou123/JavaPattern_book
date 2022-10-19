package jdp3e.interpreter.implementation_2;

class Client {

	public static void main(String[] args) {
		System.out.println("***Modified Interpreter Pattern Demonstration-2***\n");

		// Minimum Criteria for promotion is:
		// The year of experience is a minimum of 10 yrs. and
		// Employee grade should be either G2 or G3
		Context context = new Context(10, "G2", "G3");

		// String input="emp1";//false
		// String input="emp2";//true
		// String input="emp3";//true
		// String input="emp4";//false
		// String input="emp1 not";//true
		
		// String input="emp2 not";//false
		// String input="emp4 emp2 not and";//false
		 String input="emp3 emp4 emp2 not and or";//true
		
	
		
		//String input = "emp2 emp3 emp4 emp2 not and or and";// true	
		
		//String input = "emp2 emp2 emp3 emp4 emp2 not and or or";// true-ignored additional opeands		
		//String input = "emp2 not";// false
		//String input = "emp2 true";// IllegalArgumentException
		//String input = "emp2 emp3 emp2 not";// false
		
		// Additional/unnecessary inputs at the beginning
		//String input = "emp1 emp3 emp2 emp3 emp4 emp2 not and or or";// true	
		

		EmployeeBuilder builder = new EmployeeBuilder();
		builder.parse(input);
		Employee finalExpression = builder.currentStack.pop();
		Boolean result = finalExpression.interpret(context);
		System.out.print(input + ":" + result);
		
		// Removing additional elements(if any)
		// These can come from additional inputs such as 
		//String input = "emp1 emp2 emp3 emp2 emp3 emp4 emp2 not and or or";// true	
		builder.currentStack.clear();

	}

}
