package jdp3e.solid_principles.without_dip;

/**
 * @author DeYou
 * @date 2022/10/17
 */
class UserInterface {
    private OracleDatabase oracleDatabase;
    public UserInterface() {
        this.oracleDatabase = new OracleDatabase();
    }
    public void saveEmployeeId(String empId) {
        // Assuming that this is a valid data.
        // So, storing it in the database.
        oracleDatabase.saveEmpIdInDatabase(empId);
    } }