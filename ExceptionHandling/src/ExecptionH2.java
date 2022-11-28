import java.util.Scanner;

public class ExecptionH2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			System.out.println("Welcome!!!");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter num1:");
			int num1=sc.nextInt();
			
			System.out.println("Enter num2:");
			int num2=sc.nextInt();
			
			int res=num1/num2;
			System.out.println("the result is:"+res);
			
			
			System.out.println("Enter size of array:");
			int size=sc.nextInt();
			
			int[] a=new int[size];
			
			
			System.out.println("Please enter value&positon of value to insert");
			
			int val=sc.nextInt();
			int pos=sc.nextInt();
			
			a[pos]=val;
			
			System.out.println(a[pos]+"Value inserted at"+pos);
			
			}
			
//			catch(ArrayIndexOutOfBoundsException ec) {
//			
//				System.out.println("Enter valid position!!");
//			}
			
			catch(ArithmeticException ae) {
				
				System.out.println("Enter valid input");
			}
			catch(Exception e) {
				System.out.println("Enter valid values");
			}

	}

}
