package jdp3e.bridge.implementation_1;

// Abstraction

abstract class ElectronicItem {	

	// Composition - implementor
	protected PriceType priceType;
	protected ElectronicItem(PriceType priceType) {
		this.priceType=priceType;
	}
	/*
	 * This method implementation specific. 
	 * We'll use an implementor object to invoke
	 * this method.
	 */
	protected abstract void showPriceDetail();

}
