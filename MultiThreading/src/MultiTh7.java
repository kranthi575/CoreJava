
class Cinema implements Runnable
{
	int i;
	
	 public void count() {
		i++;
		System.out.println("Thread name"+Thread.currentThread().getName());
		
		System.out.println("the count value is :"+i);
	}
	
	public void run() {
		
		try {
			System.out.println(Thread.currentThread().getName()+" Is went to cinema");
			Thread.sleep(20000);
			System.out.println(Thread.currentThread().getName()+"Is went to sleep");
			Thread.sleep(10000);
			System.out.println(Thread.currentThread().getName()+"Is came out of sleep");
			System.out.println("calling count:");
			count();
			
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
public class MultiTh7 {

	public static void main(String[] args) {

		Cinema c=new Cinema();
		
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		Thread t3=new Thread(c);
		
		t1.setName("BOY");
		t2.setName("GIRL");
		t3.setName("TIKTOKER");
		
		t1.start();
		t2.start();
		t3.start();
		

		
	}

}
