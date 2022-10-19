//USED FOR Q&A

package jdp3e.observer.implementation_2;

class Client2 {
	public static void main(String[] args) {
		System.out.println("***Observer Pattern Demonstration-2.***\n");
		// We have 4 different observers.
		Observer roy = new Employee("Roy");
		Observer kevin = new Employee("Kevin");
		Observer bose = new Customer("Bose");
		Observer jacklin = new Customer("Jacklin");

		System.out.println("Working with the company: Abc Ltd.\n");
		Company abcLtd = new SpecificCompany("ABC Ltd.");
		// Registering the observers - Roy, Kevin, Bose
		abcLtd.register(roy);
		abcLtd.register(kevin);
		abcLtd.register(bose);
		System.out.println(" ABC Ltd.'s curent stock price is $5.");
		abcLtd.setStockPrice(5);
		System.out.println("-----");

		// Kevin doesn't want to get further notification.
		System.out.println("\nABC Ltd. is removing Kevin from the observer list now.");
		abcLtd.unRegister(kevin);
		// No notification is sent to Kevin any more.

		System.out.println("\n ABC Ltd.'s new stock price is $50.");
		abcLtd.setStockPrice(50);
		System.out.println("-----");

		System.out.println("\nKevin registers again to get notification from ABC Ltd.");
		abcLtd.register(kevin);

		System.out.println("\n ABC Ltd.'s new stock price is $100.");
		abcLtd.setStockPrice(100);
		System.out.println("-----");

		System.out.println("\n Working with another company: XYZ Co.");

		// Creating another company
		Company xyzCo = new SpecificCompany("XYZ Co.");
		// Registering the observers-Roy and Jacklin
		xyzCo.register(roy);
		xyzCo.register(jacklin);
		System.out.println("\nXYZ Co.'s new stock price is $500.");
		xyzCo.setStockPrice(500);

		// An observer unregisters himself
		roy.unregisterFrom(xyzCo);
		xyzCo.setStockPrice(5000);
		System.out.println("-----");

		// An observer registers himself
		kevin.registerTo(xyzCo);
		xyzCo.setStockPrice(50000);
		System.out.println("-----");

		abcLtd.unRegister(jacklin);

	}
}
