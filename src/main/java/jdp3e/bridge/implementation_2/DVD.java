package jdp3e.bridge.implementation_2;

class DVD extends ElectronicItem {
	/*
     * Implementation specific:
     * Delegating the task
     * to the Implementor object.
     */

	public DVD(PriceType priceType) {
    	super(priceType);
		this.productType="DVD";
		this.cost=3000;
	}
 
    // Specific method in the DVD class
	
    public void getDoubleDiscountWithThanks() {
    	getDiscount(10); //10% discount
    	getDiscount(5); // Additional 5% discount
    	conveyThanks();
	}
}
