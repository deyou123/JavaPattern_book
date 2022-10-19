package jdp3e.bridge.implementation_1;

// This is ConcreteImplementor-2

class ShowroomPrice implements PriceType {
	@Override
	public void displayProductPrice(String productType, double cost) {
		System.out.println("The " + productType + "'s showroom price is $"+ cost);
	}
}
