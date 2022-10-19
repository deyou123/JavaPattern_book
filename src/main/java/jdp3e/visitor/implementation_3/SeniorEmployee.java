package jdp3e.visitor.implementation_3;

import java.util.Collection;

//It is a non-leaf node
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
	public Collection<Employee> getSubordinates(){
		return subordinates;
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
