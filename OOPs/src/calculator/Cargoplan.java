package calculator;

public class Cargoplan extends Plan{

	
	//overriding methods
	
	public Cargoplan(){
		
		System.out.println("Cargoplan Contructor ");
	}
	public void takeoff() {
		System.out.println("Cargoplan take-off");
	}
	
	public void touchdown() {
		
		System.out.println("cargoplan touch-down");
	}
	
	//specialized methods
	public void show() {
		System.out.println("this is cargoplan");
	}
}
