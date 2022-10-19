package jdp3e.solid_principles.srp;

import java.util.Random;

class EmployeeIdGenerator {
	String empId;
	public String generateEmpId(String empFirstName) {
		int random = new Random().nextInt(1000);
		empId = empFirstName.substring(0, 1) + random;
		return empId;
	}

}
