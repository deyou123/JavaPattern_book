package jdp3e.interpreter.implementation_1;

class ExpressionBuilder {

	public Employee validateExpression(Employee emp1, String operator, Employee emp2) {

		// Converting the input into the lower case
		switch (operator.toLowerCase()) {

		case "or":
			return new OrExpression(emp1, emp2);
		case "and":
			return new AndExpression(emp1, emp2);
		case "not":
			return new NotExpression(emp1);
		default:
			System.out.println("You have used an invalid operator:" + operator);
			System.out.println("(The result is always false for this expression)");
			return new InvalidExpression();

		}
	}

	// Validating the rule: emp1 and (emp2 or (emp3 or emp4))

	public Employee validateComplexExpression(Employee emp1, Employee emp2, Employee emp3, Employee emp4) {
		// (emp3 or emp4)
		Employee firstPhase = new OrExpression(emp3, emp4);
		// emp2 or (emp3 or emp4)
		Employee secondPhase = new OrExpression(emp2, firstPhase);
		// emp1 and (emp2 or (emp3 or emp4))
		Employee finalPhase = new AndExpression(emp1, secondPhase);
		return finalPhase;
	}

}
