package jdp3e.prototype.implementation_1;

abstract class BasicCar implements Cloneable {
	String modelName;
	public int basePrice=0,onRoadPrice=0;

	public String getModelname() {
		return modelName;
	}
	public void setModelname(String modelname) {
		this.modelName = modelname;
	}
	
	public BasicCar clone() throws CloneNotSupportedException {
		return  (BasicCar)super.clone();
	}	
}

