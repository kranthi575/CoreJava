package calculator;

public class Inheritance {
	
	

	public static void main(String[] args) {
		
		
		System.out.println("Main method");
		
		Cargoplan flight=new Cargoplan();
		
		//flight.takeoff();
		
		//flight.show();
		
		Plan plan=new Cargoplan();//upcasting
		
		plan.takeoff();
		
	}

}
