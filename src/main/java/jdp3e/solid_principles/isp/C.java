package jdp3e.solid_principles.isp;

/**
 * @author DeYou
 * @date 2022/10/17
 */
class Client {
    public static void main(String[] args) {
        System.out.println("***A demo that follows ISP.***");
        Printer printer = new BasicPrinter();
        printer.printDocument();

        printer = new AdvancedPrinter();
        printer.printDocument();
        FaxDevice faxDevice = new AdvancedPrinter();
        faxDevice.sendFax();
    }
}