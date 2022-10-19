package jdp3e.visitor.implementation_3;

class Client {

	public static void main(String[] args) {
		System.out.println("***Composite Pattern and Visitor Pattern Modified Demonstration.***");

		Employee hodMath = formMathDept();
		Employee hodCompSc = formComputerScDept();
		Employee principal = formPrincipal(hodMath, hodCompSc);
		printCollegeStructure(principal);
		Visitor visitor = new PromotionCheckerVisitor();
		System.out.println("\nChecking potential candidates for the promotion:");
        visitCandidates(principal,visitor);		
	}

	private static void visitCandidates(Employee emp, Visitor visitor) {
		emp.acceptVisitor(visitor);
		emp.getSubordinates().forEach(e->visitCandidates(e,visitor));		
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
		Employee hodMaths = new SeniorEmployee("Mrs.S.Das", "HOD(Math)", 12.5);
		// Teachers of Mathematics directly
		// reports to HOD-Mathematics
		hodMaths.addEmployee(mathTeacher1);
		hodMaths.addEmployee(mathTeacher2);
		return hodMaths;

	}

	private static Employee formPrincipal(Employee hod_Math, Employee hod_CompSc) {
		// Principal of the college
		Employee principal = new SeniorEmployee("Dr.S.Som", "Principal", 21);

		// The Principal is on top of the college.
		// The HOD(Mathematics) and HOD(Computer Sc.)
		// directly report to him.

		principal.addEmployee(hod_Math);
		principal.addEmployee(hod_CompSc);
		return principal;
	}

}
