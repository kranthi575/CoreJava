class Demo extends Thread{
	int total=0;
	public void run() 
	{
		synchronized (this) 
		{
			
			System.out.println("Child starts execution...");
			for(int i=1;i<=100;i++) 
			{
				total=total+i;
			}
			
			this.notify();
		}
}
	
}

public class InterThreadComm2 {

	public static void main(String[] args) throws Exception {
		
		Demo d=new Demo();
		
		d.start();
		//
		//Thread.sleep(1);
		//System.out.println(d.total);
		
		synchronized(d) {
			
			System.out.println("Main Thread is calling wait() method...");
			
			d.wait();
			
			System.out.println("Main Thread is notified...");
			
			System.out.println(d.total);
			
		}
		
		
	}

}
