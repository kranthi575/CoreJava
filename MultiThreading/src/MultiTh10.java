
class Warrior implements Runnable
{
	String res1=new String("Brahmastra");
	
	String res2=new String("Sarphastra");
	
	String res3=new String("Pashupatastra");
	
	public void run()
	{
		try
		{
			String name=Thread.currentThread().getName();
			
			if(name.equals("Rama"))
			{
				ramaAcqRes();
			}
			else
			{
				ravanaAcqRes();
			}
			
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
	}
	//deadlock
	//A phenomena where multiple threads were got stick in block state
	//with mutual dependency of resources of one other.
	public void ramaAcqRes() 
	{
			try
			{
			Thread.sleep(40000);
			
				synchronized(res1)
				{
					System.out.println("Rama has acquired:"+res1);
					Thread.sleep(40000);
					synchronized(res2)
					{
						System.out.println("Rama has acquired:"+res2);
						Thread.sleep(40000);
						synchronized(res3)
						{
							System.out.println("Rama has acquired:"+res3);
							
						}
					}
				}
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}	
	}
	
	public void ravanaAcqRes()
	{
		
			try
			{
			Thread.sleep(40000);
			
				synchronized(res1)
				{
					System.out.println("Ravana has acquired:"+res1);
					Thread.sleep(40000);
					synchronized(res2)
					{
						System.out.println("Ravana has acquired:"+res2);
						Thread.sleep(40000);
						synchronized(res3)
						{
							System.out.println("Ravana has acquired:"+res3);
							
						}
					}
				}
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}	
			
		
	}
}


public class MultiTh10
{

	public static void main(String[] args) 
	{
		Warrior w=new Warrior();
		
		Thread t1=new Thread(w);
		Thread t2=new Thread(w);
		
		t1.setName("Rama");
		t2.setName("Ravana");
		
		t1.start();
		t2.start();
		
		
		
			
	}

}
