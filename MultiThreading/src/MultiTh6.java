
interface Text{
	
	void page();
}
public class MultiTh6 {

	public static void main(String[] args){
		
		
		Text a=new Text(){
			public void page() {
				
			}
		};
		
		Runnable r1=new Runnable() {
			public void run() {
				
				System.out.println("Thread1.......");
				try {
				Thread.sleep(20000);}
				catch(InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		};
		Runnable r2=()->{
			
				try {
				Thread.sleep(20000);
				System.out.println("Thread2.......");}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			
		};
		
		r1.run();
		
		r2.run();
		
		

	
	}
}
