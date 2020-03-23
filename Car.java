public class Car extends Vehicles {  
      
    
	public Car(String brand) {  
	    super(brand);    
	}
  
    @Override
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais vroum vroum!";
    }  
}