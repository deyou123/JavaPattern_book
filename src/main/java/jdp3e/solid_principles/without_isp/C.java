package jdp3e.solid_principles.without_isp;

/**
 * @author DeYou
 * @date 2022/10/17
 */
class Client {
    public static void main(String[] args) {
        System.out.println("***A demo without ISP.***");
        Printer printer = new AdvancedPrinter();
        printer.printDocument();
        printer.sendFax();
        printer = new BasicPrinter();
        printer.printDocument();
        // printer.sendFax(); // Will throw error
    }
}