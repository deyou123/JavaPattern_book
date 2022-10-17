package jdp3e.solid_principles.isp;

/**
 * @author DeYou
 * @date 2022/10/17
 */
class AdvancedPrinter implements Printer,FaxDevice {
    @Override
    public void printDocument() {
        System.out.println("The advanced printer prints a document.");
    }
    @Override
    public void sendFax() {
        System.out.println("The advanced printer sends a fax.");
    } 
}