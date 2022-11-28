@FunctionalInterface
interface Computer2{
	
	void show();
}


public class LamdaDemo {

	public static void main(String[] args) {
//		
//		Computer c=new Computer() {
//			
//			public void show() {
//				System.out.println("this is show method with innner calss");
//			}
//		};
		
		Computer2 c=() ->
		{
			System.out.println("Show method with lamda expression");
		};
		
		
		
		c.show();
		

	}

}
