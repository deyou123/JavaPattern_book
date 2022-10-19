package jdp3e.solid_principles.dip;

class OracleDatabase implements Database {
	@Override
	public void saveEmpIdInDatabase(String empId) {
		System.out.println("The id: " + empId + " is saved in the Oracle database.");
	}
}
