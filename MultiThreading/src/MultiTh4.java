class Banking1 implements Runnable{
	
	public void run() {
		
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
class Printing1  implements Runnable{
	
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
class Calculating1 implements Runnable{
	
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
public class MultiTh4 {

	public static void main(String[] args) {
		
		Banking1 b1=new Banking1();
		Printing1 p1=new Printing1();
		Calculating1 c1=new Calculating1();
		
		Thread t1=new Thread(b1);
		Thread t2=new Thread(p1);
		Thread t3=new Thread(c1);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
		
		
	}

}
