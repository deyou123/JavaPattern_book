package jdp3e.solid_principles.without_lsp;

class RegisteredUserPayment implements Payment {
    String name;
    public RegisteredUserPayment(String userName) {
        this.name = userName;
    }
    @Override
    public void previousPaymentInfo(){
        System.out.println("Retrieving "+ name+"'s last payment details.");
    	// Some other code, if any
    }

    @Override
    public void newPayment(){
    	System.out.println("Processing "+name+"'s current payment request.");
    	// Some other code, if any
    }	
}
