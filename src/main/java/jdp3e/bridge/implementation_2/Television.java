package jdp3e.bridge.implementation_2;

class Television extends ElectronicItem{
	/*
     * Implementation specific:
     * Delegating the task
     * to the Implementor object.
     */	

    public Television(PriceType priceType) {
    	super(priceType);
		this.productType="television";
		this.cost=2000;
	}
    
    // No additional method exists for Television
}

