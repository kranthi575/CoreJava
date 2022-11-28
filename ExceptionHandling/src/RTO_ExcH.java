import java.util.Scanner;

class UnderAgeException extends Exception
{
	public UnderAgeException(String msg)
	{
		
		super(msg);

	}
	
}

class OverAgeException extends Exception
{
	public OverAgeException(String msg)
	{
		
		super(msg);
		
	}
	
	
}
class LApp
{
	
	private int age;
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dear kindly enter your age to check eligibility:");
		
		age=sc.nextInt();		
	}
	
	public void verify() throws UnderAgeException
	{
		
		
		if(age>18)
		{
			
			System.out.println("You are eligibe for license");
		}
		else
		{
			
			throw new UnderAgeException("Your under age !!");
		}
	}	
	
}

class RTO
{
	
	void initiate() {
		
		LApp lapp=new LApp();
		try
		{
		lapp.input();
		lapp.verify();
		}
		catch(UnderAgeException uae)
		{
			System.out.println(uae.getMessage());
			
		}
	}
	
}



public class RTO_ExcH {

	public static void main(String[] args) {
		
		RTO rto=new RTO();
		
		rto.initiate();
		
	}

}
