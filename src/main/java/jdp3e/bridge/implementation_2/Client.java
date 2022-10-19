package jdp3e.bridge.implementation_2;

class Client {

	public static void main(String[] args) {
		System.out.println("***Alternative Implementation of Bridge Pattern.***");
		
		System.out.println("Verifying the market price of a television.");
		// Verifying online price
		ElectronicItem eItem = new Television(new OnlinePrice());
		eItem.showPriceDetail();	
		
		// Verifying the offline/showroom price
		eItem = new Television(new ShowroomPrice());
		eItem.showPriceDetail();
		eItem.getDiscount(7);
		eItem.conveyThanks();
		//Error: the following method is DVD specific.
		//eItem.getDoubleDiscountWithThanks();
		
		System.out.println("----------");
		
		System.out.println("Verifying the market price of a DVD.");
		// Verifying online price
		eItem = new DVD(new OnlinePrice());
		eItem.showPriceDetail();		
		
		// Verifying the offline/showroom price
		eItem = new DVD(new ShowroomPrice());
		eItem.showPriceDetail();		
		
		//Checking DVD specific methods		
		((DVD)eItem).getDoubleDiscountWithThanks();
	}	

}
