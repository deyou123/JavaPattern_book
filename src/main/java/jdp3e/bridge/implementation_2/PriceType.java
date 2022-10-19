package jdp3e.bridge.implementation_2;

//Implementor
interface PriceType {

	void displayProductPrice(String product,double cost);
    
	// The additional method(s) in implementation-2
    void festiveSeasonDiscount(int percentage);    
    void sayThanks();

}