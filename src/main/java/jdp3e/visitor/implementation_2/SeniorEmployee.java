package jdp3e.visitor.implementation_2;

// SeniorEmployee.java

// It is a non-leaf node
class SeniorEmployee extends Employee {
	public SeniorEmployee(String name, String designation, double experience) {
		super(name, designation, experience);
	}

	@Override
	protected void printStructures() {
		System.out.println("\t" + this.name + " is a " + this.designation + ". Experience:" + this.experience);
		for (Employee e : subordinates) {
			e.printStructures();
		}
	}

	@Override
	protected int getSubordinatesCount() {
		subordinatesCount = subordinates.size();
		for (Employee e : subordinates) {
			subordinatesCount += e.getSubordinatesCount();
		}
		return subordinatesCount;
	}

	@Override
	protected void addEmployee(Employee e) {
		subordinates.add(e);
	}

	@Override
	protected void removeEmployee(Employee e) {
		subordinates.remove(e);
	}

	@Override
	public void acceptVisitor(Visitor visitor) {
		visitor.visitTheElement(this);
	}	
}
