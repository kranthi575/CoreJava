@FunctionalInterface
interface  Add1{
	
	int add();
	String toString();
}



public class Lamda2 {

	
	public static void main(String args[]) {
		
		Add1 a=()->{
			
			
			
			return 2;
		};
		
		
		
		System.out.println(a.add());
			
		
		
		
	}
}
