package jdp3e.solid_principles.srp;

class Client {

	public static void main(String[] args) {
		System.out.println("*** A demo that follows the SRP.***");

		Employee robin = new Employee("Robin", "Smith", 7.5);
		showEmpDetail(robin);

		System.out.println("\n*******\n");

		Employee kevin = new Employee("Kevin", "Proctor", 3.2);
		showEmpDetail(kevin);

	}

	private static void showEmpDetail(Employee emp) {
		
		// Display employee detail
		emp.displayEmpDetail();
		
		//Generate the ID
		EmployeeIdGenerator idGenerator = new EmployeeIdGenerator();
		String empId=idGenerator.generateEmpId(emp.firstName);
		System.out.println("The employee id: " + empId);
		
		// Check the seniority level
		SeniorityChecker seniorityChecker = new SeniorityChecker();		
		System.out.println("This employee is a " + seniorityChecker.checkSeniority(emp.experienceInYears) + " employee.");
	}

}
