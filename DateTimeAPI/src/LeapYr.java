/*
 * rule for leap year
=============
=> A year may be a leap year if it is evenly divisible by 4.
=> Years that are divisible by 100 (century years such as 1900 or 2000) cannot be
leap years unless they are also
divisible by 400.
 */
import java.time.Year;

public class LeapYr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integer data = Integer.parseInt(args[0]);
		
		int data=2021;
		
		Year yr = Year.of(data);
		
		if(yr.isLeap()) {
			System.out.println("This is leap year");
		}
		else
		{
			System.out.println("This is not a leap year");
		}
		
		int a=3;
		int b=5;
		int c=10;
		
		System.out.println(++c+b-b+c+a++);
		
		

	}

}
