package jdp3e.solid_principles.dip;

/**
 * @author DeYou
 * @date 2022/10/17
 */
class UserInterface {
    Database database;
    public UserInterface(Database database) {
        this.database = database;
    }
    public void saveEmployeeId(String empId) {
        database.saveEmpIdInDatabase(empId);
    } }