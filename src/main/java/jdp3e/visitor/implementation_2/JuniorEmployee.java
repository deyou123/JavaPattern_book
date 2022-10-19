package jdp3e.visitor.implementation_2;

// JuniorEmployee.java 

class JuniorEmployee extends Employee {
	public JuniorEmployee(String name, String designation, double experience) {
		super(name, designation, experience);
	}

	@Override
	protected void printStructures() {
		System.out.println("\t\t" + this.name + " is a " + this.designation + ". Experience: " + this.experience);
	}

	@Override
	protected int getSubordinatesCount() {
		return subordinatesCount;// Always 0
	}

	@Override
	protected void addEmployee(Employee e) {
		// Empty method
	}

	@Override
	protected void removeEmployee(Employee e) {
		// Empty method
	}

	@Override
	public void acceptVisitor(Visitor visitor) {
		visitor.visitTheElement(this);
	}

}
