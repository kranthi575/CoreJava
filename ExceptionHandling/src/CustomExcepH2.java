import java.util.Scanner;

//custom exception
class InvalidInputException extends Exception
{
	 public InvalidInputException(String msg) {
		super(msg);
	}
	
}

class ATM1
{
	
	private int accountNum=1111;
	private int password=2222;
	
	private int accNum;
	private int pwd;
	
	public void input()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter account number: ");
		accNum=sc.nextInt();
		System.out.println("Please enter account Password: ");
		pwd=sc.nextInt();
	}
	
	public void verify() throws InvalidInputException
	{
		
		if(accountNum==accNum && password==pwd)
		{
			
			System.out.println("Collect your cash");
			
		}
		else
		{
//			InvalidInputException invalidinputexception=new InvalidInputException();
//			
//			System.out.println("Invalid credentials!!");
//			
			throw new InvalidInputException("Invalid credentials!!");
		}
	}
	
	public void terminate() {
		
		System.exit(0);
	}
	
}

class Bank1
{
	
	
	public void initiate()
	{
		ATM1 atm=new ATM1();
		try 
		{
		atm.input();
		atm.verify();
		}
		catch(InvalidInputException e) 
		{
			System.out.println(e.getMessage());
			try 
			{
			atm.input();
			atm.verify();
			}
			catch(InvalidInputException e1)
			{	
				System.out.println("Card is blocked TATA BYE BYE!!");
				atm.terminate();
			}
			
		}
		
	}
	
	
}

public class CustomExcepH2 {

	public static void main(String[] args) {
		
		Bank1 bank=new Bank1();
		bank.initiate();
	}

}
