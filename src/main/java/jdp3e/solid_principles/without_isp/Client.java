package jdp3e.solid_principles.without_isp;

/**
 * @author DeYou
 * @date 2022/10/17
 */
class AdvancedPrinter implements Printer {
    @Override
    public void printDocument() {
        System.out.println("The advanced printer prints a document.");
    }
    @Override
    public void sendFax() {
        System.out.println("The advanced printer sends a fax.");
    } 
}