package jdp3e.solid_principles.without_lsp;

/**
 * @author DeYou
 * @date 2022/10/17
 */
class GuestUserPayment implements Payment {
    String name;
    public GuestUserPayment() {
        this.name = "guest";
    }
    @Override
    public void previousPaymentInfo(){
        throw new UnsupportedOperationException();
    }
    @Override
    public void newPayment(){
        System.out.println("Processing "+name+"'s current payment request.");
                // Some other code, if any
    }
}