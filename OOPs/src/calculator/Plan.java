package calculator;

public class Plan {
	
	
	static {
		
		System.out.println("this static block - Plan");
		
	}
	{
		
		
		System.out.println("this is non-static block - Plan");
		
	}
	
	public Plan() {
		
		System.out.println("Plan constructor");
	}
	
	public void takeoff() {
		
		System.out.println("Flight  take-off");
	}

	public void touchdown() {
		
		System.out.println("Flight Touch-down");
	}
	
	public static void disp() {
		
		System.out.println("this is static disp method - Plan");
	}
	
	public static void main(String args[]) {
		
		System.out.println("this is main method - Plan");
		
		Plan.disp();
		
		
	}
}
