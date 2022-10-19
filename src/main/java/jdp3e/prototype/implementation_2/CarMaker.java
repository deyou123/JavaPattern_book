package jdp3e.prototype.implementation_2;


class CarMaker {
	BasicCar nano, ford;

	public CarMaker() {
		nano = new Nano("Nano XM624 cc");
		ford = new Ford("Ford Aspire");
	}
	
	public BasicCar getNano() throws CloneNotSupportedException {
		return nano.clone();
	}

	public BasicCar getFord() throws CloneNotSupportedException {
		return ford.clone();
	}
}




/**
 * 
 * @author Vaskaran Sarcar
 * Alternative version of the CarMaker class.
 */


/*
class CarMaker {
	BasicCar nano, ford;

	public CarMaker() {
		
	}
	
	public BasicCar getNano() throws CloneNotSupportedException {
				
		if (nano!=null){    
            // A Nano instance was created earlier.
            // Returning a clone of it.
            return nano.clone();
        }else {       
       
           
           //   Create a nano for the first 
           //   time and return it.
            
            nano = new Nano("Nano XM624 cc");
            return nano;
        }

	}

	public BasicCar getFord() throws CloneNotSupportedException {
		if (ford!=null){
        
            // A Ford instance was created earlier.
            // Returning a clone of it.
            return ford.clone();
        }
        else{
        
           
            //  Creates a Ford for the first 
            //  time and return it.
           
            nano = new Ford("Ford Aspire");
            return nano;
        }
	}
}
*/

