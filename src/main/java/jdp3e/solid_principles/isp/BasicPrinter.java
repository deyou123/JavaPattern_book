package jdp3e.solid_principles.isp;

/**
 * @author DeYou
 * @date 2022/10/17
 */
class BasicPrinter implements Printer {
    @Override
    public void printDocument() {
        System.out.println("The basic printer prints a document.");
    }


}