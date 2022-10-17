package jdp3e.solid_principles.dip;

/**
 * @author DeYou
 * @date 2022/10/17
 */
class Client {
    public static void main(String[] args) {
        System.out.println("***A demo that follows the DIP.***");
        // Using Oracle now
        Database database = new OracleDatabase();
        UserInterface userInterface = new
                UserInterface(database);
        userInterface.saveEmployeeId("E001");
        // Using MySQL now
        database = new MySQLDatabase();
        userInterface = new UserInterface(database);
        userInterface.saveEmployeeId("E002");
    }
}