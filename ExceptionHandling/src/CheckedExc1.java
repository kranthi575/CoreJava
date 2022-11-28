import java.lang.Thread;
import java.util.Scanner;

class Sample{
	
	
	public void calc() {
		try {
		System.out.println("App start here:");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter num1:");
		int a=sc.nextInt();
		System.out.println("Enter num2:");
		int b=sc.nextInt();
		
		int c=a/b;
		
		System.out.println("Printing C:"+c);
		
		}
		
		catch(ArithmeticException ae) {
			
			System.out.println("Exception is handled in this method");
			throw ae;
		}
		catch(Exception e) {
			
		}
		finally {
			
			System.out.println("Finally block");
		}
		
	}
}

public class CheckedExc1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Sample s=new Sample();
		try {
		s.calc();
		}
		catch(ArithmeticException ae) {
			
			System.out.println("Exception is handled in main method");
		}
		
	}

}
