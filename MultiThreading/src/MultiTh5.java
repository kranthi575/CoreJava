
class Alpha extends Thread{
	
	
	public void run() {
		
		String str=Thread.currentThread().getName();
		if(str.equals("Banking"))
		banking();
		else if(str.equals("Printing"))
		printing();
		else
		calculating();
		
		
	}
	
	
	public void banking() {
		
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
	public void printing() {
		
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
	public void calculating() {
		
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
public class MultiTh5 {

	public static void main(String[] args) {
		
		Alpha a1=new Alpha();
		Alpha a2=new Alpha();
		Alpha a3=new Alpha();
		
		a1.setName("Banking");
		a2.setName("Printing");
		a3.setName("Calculating");
		
		a1.start();
		a2.start();
		a3.start();
		
		
	}

}
