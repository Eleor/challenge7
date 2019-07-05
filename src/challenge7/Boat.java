package challenge7;

public class Boat extends Vehicle { 

	
	public Boat(String brand, int kilometers) {  
	    super(brand, kilometers); 
	}

	@Override
	public String doStuff() {
		// TODO Auto-generated method stub
		return ("je suis " + getBrand() + " et je fais glou glou !");
	}
	
	
	
}
