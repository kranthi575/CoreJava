import java.util.Scanner;

public class ExceptionH1 {

	public static void main(String[] args) {

		
		try {
		
		System.out.println("Welcome!!!");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		
		int res=num1/num2;
		System.out.println("the result is:"+res);
		
		}
		
		catch(ArrayIndexOutOfBoundsException ec) {
		
			System.out.println("Enter valid number!!");
		}
		
		catch(ArithmeticException ae) {
			
			System.out.println("Enter valid input");
		}
		
		System.out.println("End of Application!!");
		
		
	}

}
