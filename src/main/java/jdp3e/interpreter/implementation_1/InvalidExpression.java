package jdp3e.interpreter.implementation_1;


class InvalidExpression implements Employee {

	@Override
	public boolean interpret(Context context) {
		return false; // result is always false
	}
}
