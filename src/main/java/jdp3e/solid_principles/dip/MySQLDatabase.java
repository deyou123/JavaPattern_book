package jdp3e.solid_principles.dip;

/**
 * @author DeYou
 * @date 2022/10/17
 */
class MySQLDatabase implements Database {
    @Override
    public void saveEmpIdInDatabase(String empId) {
        System.out.println("The id: " + empId + " is saved in the MySQL database.");
    } }