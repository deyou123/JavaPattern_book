package jdp3e.observer.implementation_1;

import java.util.ArrayList;
import java.util.List;

abstract class Company {

	List<Observer> observerList = new ArrayList<Observer>();
	
	// Name of the subject
	private String name;

	public Company(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	// For the stock price
	private int stockPrice;

	public int getStockPrice() {
		return this.stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
		// The stock price is changed.
		// So,notify observer(s).
		notifyRegisteredUsers();
	}

	// To register an observer
	abstract void register(Observer o);

	// To Unregister an observer
	abstract void unRegister(Observer o);

	// To notify registered users
	abstract void notifyRegisteredUsers();

}
