package jdp3e.bridge.implementation_2;

class ShowroomPrice implements PriceType {

	@Override
	public void displayProductPrice(String productType, double cost) {
		System.out.println("The " + productType + "'s showroom price is $"+ cost);
		
	}

	@Override
	public void festiveSeasonDiscount(int percentage) {
		System.out.println(" You can get a maximum of " + percentage + "% discount in the festive seasons.");
	}

	@Override
	public void sayThanks() {
		System.out.println("Thank you for your interest in our product.");		
	} 
}
