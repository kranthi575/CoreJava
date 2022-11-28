
class Banking extends Thread{
	
	
	public void run(){
		
		System.out.println("Banking Task started::");
		
		for(int i=0;i<3;i++) {
			try {
			Thread.sleep(2000);
			}
			catch(InterruptedException ie) {
				
				ie.printStackTrace();
			}
			System.out.println("Banking..............");
		}
		System.out.println("Banking completed...");
		
		System.out.println("_____________________");
		
		
	}
}
class Printing extends Thread{
	
	
	public void run() {
		System.out.println("Printing  Task started::");
		
		for(int i=0;i<3;i++) {
			try {
			Thread.sleep(2000);
			System.out.println("Printing..............");}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		System.out.println("Printing completed...");
		
		System.out.println("_____________________");
		
		
	}
}
class Calculating extends Thread{
	
	
	public void run() {
		System.out.println("Calculation Task started::");
		
		for(int i=0;i<3;i++) {
			try {
			Thread.sleep(2000);
			System.out.println("Calculating..............");
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		System.out.println("Calculation completed...");
		
		System.out.println("_____________________");
		
	}
}
public class MultiTh3 {

	public static void main(String[] args) {
		
		/*
		 * To create Thread:
		 * 1. extending Thread Class
		 * 2.Implementing Runnable Interface
		 */
		Banking b=new Banking();
		Printing p=new Printing();
		Calculating c=new Calculating();
		
		b.start();
		p.start();
		c.start();
		
		
		
	}

}
