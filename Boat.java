public class Boat extends Vehicles {  
      
    
	public Boat(String brand) {  
	    super(brand);    
	}
  
    @Override
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais glou glou!";
    }
}