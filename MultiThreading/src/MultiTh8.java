class Ineuron implements Runnable
{
	
	 synchronized public void run() 
	{
		
		try 
		{
			for(int i=0;i<3;i++)
			{
				System.out.println(i);
			}
			Thread.sleep(30000);
			for(int i=0;i<3;i++)
			{
				System.out.println((char)(i+65));
			}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		
		
	}
	
		
}
public class MultiTh8 {

	public static void main(String[] args)
	{
		Ineuron i=new Ineuron();
		
		Thread t1=new Thread(i);
		Thread t2=new Thread(i);
		Thread t3=new Thread(i);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
