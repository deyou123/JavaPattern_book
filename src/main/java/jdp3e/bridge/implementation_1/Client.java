package jdp3e.bridge.implementation_1;

class Client {

	public static void main(String[] args) {
		System.out.println("***Bridge Pattern Demo.***");

		System.out.println("Verifying the market price of a television.");
		// Verifying online price
		ElectronicItem eItem = new Television(new OnlinePrice());
		eItem.showPriceDetail();
		//System.out.println("----------");
		
		// Verifying the offline/showroom price
		eItem = new Television(new ShowroomPrice());
		eItem.showPriceDetail();
	}	

}
