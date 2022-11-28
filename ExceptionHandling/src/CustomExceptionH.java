import java.util.Scanner;

//custom exception
class InvalidInputException extends Exception
{
	
	
}

class ATM
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
			InvalidInputException invalidinputexception=new InvalidInputException();
			
			System.out.println("Invalid credentials!!");
			
			throw invalidinputexception;
		}
	}
	
	public void terminate() {
		
		System.exit(0);
	}
	
}

class Bank
{
	
	
	public void initiate()
	{
		ATM atm=new ATM();
		try 
		{
		atm.input();
		atm.verify();
		}
		catch(InvalidInputException e) 
		{
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
public class CustomExceptionH 
{

	public static void main(String[] args) 
	{
		
		Bank bank=new Bank();
		
		bank.initiate();
		
		
	}

}
