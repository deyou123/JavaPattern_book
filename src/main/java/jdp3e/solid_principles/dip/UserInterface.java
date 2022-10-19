package jdp3e.solid_principles.dip;

class UserInterface {
	Database database;

	public UserInterface(Database database) {
		this.database = database;
	}
	
	public void setDatabase(Database database) {
		this.database = database;
	}

	public void saveEmployeeId(String empId) {
		database.saveEmpIdInDatabase(empId);
	}
}
