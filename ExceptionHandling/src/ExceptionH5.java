class Sam{
	
	public void d() {
		
		
		System.out.println("Method d()");
	}
	
	public void disp() {
		
		try {
			
			System.out.println("Method disp()");
			d();
			
		}
		catch(Exception e) {
			
		}
		finally {
			
			System.out.println("Finally block");
		}
		
		
	}
}



public class ExceptionH5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sam a=new Sam();
		a.disp();

	}

}
