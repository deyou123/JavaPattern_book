package jdp3e.interpreter.implementation_2;
import java.util.Stack;

// This class can parse the input

class EmployeeBuilder {

	Employee emp1, emp2, emp3, emp4;
	Employee tempEmp;// Used as a temporary variable

	public EmployeeBuilder() {
		// Initialize valid Employees
		emp1 = new IndividualEmployee(5, "G1");
		emp2 = new IndividualEmployee(10, "G2");
		emp3 = new IndividualEmployee(15, "G3");
		emp4 = new IndividualEmployee(20, "G4");
	}

	Stack<Employee> currentStack = new Stack<>();

	public void parse(String input) {
		// Employee tempEmp;
		String[] tokens = input.split(" ");		
  
		for (String token : tokens) {			
			if (token.equals("emp1"))
				currentStack.push(emp1);//This stack contains employees,not strings
			else if (token.equals("emp2"))
				currentStack.push(emp2);
			else if (token.equals("emp3"))
				currentStack.push(emp3);
			else if (token.equals("emp4"))
				currentStack.push(emp4);				
			
			// Got an operator
			else {
				Employee emp1, emp2 = null;
				emp1 = currentStack.pop();
				// Expression 2 is not needed for a 'not' operator
				if (token.equals("and")||token.equals("or") ) {					
					emp2 = currentStack.pop();
				}
				tempEmp = evaluate(token, emp1, emp2);
				currentStack.push(tempEmp);
			}

		} // end for
		
	}// end method body

	private Employee evaluate(String operator, Employee emp1, Employee emp2) {

		// Employee tempEmp;
		switch (operator.toLowerCase()) {
		case "and":
			tempEmp = new AndExpression(emp1, emp2);
			break;
		case "or":
			tempEmp = new OrExpression(emp1, emp2);
			break;
		case "not":
			tempEmp = new NotExpression(emp1);
			break;
		default:
			throw new IllegalArgumentException("Invalid operator: " + operator);
		}
		return tempEmp;
	}

}