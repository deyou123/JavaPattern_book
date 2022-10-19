package jdp3e.bridge.implementation_1;

class Television extends ElectronicItem{
	String productType;
	double cost;

    public Television(PriceType priceType) {
    	super(priceType);
		this.productType="television";
		this.cost=2000;
	}
    
	/*
	 * Implementation specific: 
	 * We are delegating the implementation
	 * to the Implementor object.
	 */	

	@Override
	protected void showPriceDetail() {
		priceType.displayProductPrice(productType,cost);
	}
}
