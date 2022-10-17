package jdp3e.solid_principles.lsp;

/**
 * @author DeYou
 * @date 2022/10/17
 */
class GuestUserPayment implements NewPayment {
    String name;
    public GuestUserPayment() {
        this.name = "guest";
    }
    @Override
    public void newPayment(){
        System.out.println("Processing "+name+"'s current payment request.");
                //Some code, if any
    } }