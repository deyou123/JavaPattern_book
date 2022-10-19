package jdp3e.solid_principles.without_lsp;

class Client {

	public static void main(String[] args) {
		System.out.println("***A demo without LSP.***\n");
        PaymentHelper helper = new PaymentHelper();

        // Instantiating two registered users
        RegisteredUserPayment robinPayment = new RegisteredUserPayment("Robin");
        RegisteredUserPayment jackPayment = new RegisteredUserPayment("Jack");

        // Adding the users to the helper
        helper.addUser(robinPayment);
        helper.addUser(jackPayment);

        GuestUserPayment guestUser = new GuestUserPayment();
        helper.addUser(guestUser);
        
        // Processing the payments using 
        // the helper class.
        // You can see the problem now.
        helper.showPreviousPayments();
        helper.processNewPayments();        

	}

}
