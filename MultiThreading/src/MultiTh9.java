class Methods 
{
	int count=0;
	  public void count()
	{
		System.out.println("The value of the count is :"+count);
		count++;
		System.out.println("Count value is incremented");
	}
}

class Threads extends Methods implements Runnable
{
	
	public void run() {
		
		count();
		
	}
}
public class MultiTh9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threads t=new Threads();
		
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
