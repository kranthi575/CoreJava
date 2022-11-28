
@FunctionalInterface
interface Alpha{
	
	void beta();
}




public class AnonymInterface {

	
	
	public static void main(String args[]) {
		
		Alpha a=new Alpha(){
			
			public void beta() {
				
				System.out.println("THis method of annonymous class");
			}
			
		};
		
		a.beta();
		
	}
}
