package jdp3e.bridge.implementation_2;

// Abstraction
// Making the class abstract,
// so that you cannot instantiate it
// inside the client code.

abstract class ElectronicItem {
	protected String productType;
	protected double cost;
	// Composition - implementor
	protected PriceType priceType;

	protected ElectronicItem(PriceType priceType) {
		this.priceType = priceType;
	}

	protected void showPriceDetail() {
		priceType.displayProductPrice(productType,cost);
	}
	
	// The additional methods for demonstration-2
	protected void getDiscount(int percentage) {
    	priceType.festiveSeasonDiscount(percentage);    	
	}
	
	protected void conveyThanks() {    	
    	priceType.sayThanks();
	}	
}
