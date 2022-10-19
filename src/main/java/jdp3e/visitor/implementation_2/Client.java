package jdp3e.visitor.implementation_2;


import java.util.ArrayList;
import java.util.List;

class Client {

	public static void main(String[] args) {
		System.out.println("***Composite Pattern and Visitor Pattern Demonstration.***");

		Employee hodMath = formMathDept();
		Employee hodCompSc = formComputerScDept();
		Employee principal = formPrincipal(hodMath, hodCompSc);
		printCollegeStructure(principal);

		List<Employee> participants = createContainer(principal, hodMath, hodCompSc);
		checkPromotionEligibilty(participants);
	}

	private static void printCollegeStructure(Employee principal) {
		// Printing the leaf-nodes and branches in the same way
		// i.e. in each case, we
		// are calling printStructures() method.

		System.out.println("The details of the Principal object:");
		// Prints the complete college structure
		principal.printStructures();

	}

	private static Employee formComputerScDept() {
		// Three lecturers other than HOD work
		// in the Computer Science Department.

		Employee cseTeacher1 = new JuniorEmployee("C.Kate", "Lecturer", 8.2);
		Employee cseTeacher2 = new JuniorEmployee("C.Jones", "Lecturer", 4.5);
		Employee cseTeacher3 = new JuniorEmployee("C.Proctor", "Lecturer", 6);
		Employee hodCompSc = new SeniorEmployee("Mr. V.Sarcar", "HOD(CSE)", 15.5);

		// Teachers of Computer Science
		// directly reports to HOD-CSE
		hodCompSc.addEmployee(cseTeacher1);
		hodCompSc.addEmployee(cseTeacher2);
		hodCompSc.addEmployee(cseTeacher3);
		return hodCompSc;
	}

	private static Employee formMathDept() {
		// Two lecturers other than HOD work
		// in the Mathematics department.

		Employee mathTeacher1 = new JuniorEmployee("M.Jacob", "Lecturer", 7.5);
		Employee mathTeacher2 = new JuniorEmployee("M.Rustom", "Lecturer", 3);
		Employee hodMath = new SeniorEmployee("Mrs.S.Das", "HOD(Math)", 12.5);
		// Teachers of Mathematics directly
		// reports to HOD-Mathematics
		hodMath.addEmployee(mathTeacher1);
		hodMath.addEmployee(mathTeacher2);
		return hodMath;

	}

	private static Employee formPrincipal(Employee hodMath, Employee hodCompSc) {
		// Principal of the college
		Employee principal = new SeniorEmployee("Dr.S.Som", "Principal", 21);

		// The Principal is on top of the college.
		// The HOD(Mathematics) and HOD(Computer Sc.)
		// directly report to him.

		principal.addEmployee(hodMath);
		principal.addEmployee(hodCompSc);
		return principal;
	}

	private static List<Employee> createContainer(Employee principal, Employee hodMath, Employee hodCompSc) {
		List<Employee> employeeContainer = new ArrayList<Employee>();
		// For employees who directly reports to Principal
		for (Employee e : principal.subordinates) {
			employeeContainer.add(e);
		}
		// For employees who directly reports to HOD(Math)
		for (Employee e : hodMath.subordinates) {
			employeeContainer.add(e);
		}
		// For employees who directly reports to HOD(Comp.Sc)
		for (Employee e : hodCompSc.subordinates) {
			employeeContainer.add(e);
		}
		return employeeContainer;

	}

	private static void checkPromotionEligibilty(List<Employee> container) {
		Visitor visitor = new PromotionCheckerVisitor();
		// Principal holds the highest position.
		// He does not need a promotion.
		System.out.println("\nChecking the eligible candidates for a promotion.");
		for (Employee emp : container) {
			emp.acceptVisitor(visitor);			
		}
	}

}
