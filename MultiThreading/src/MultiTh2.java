
public class MultiTh2 {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Banking Task started::");
		
		for(int i=0;i<3;i++) {
			Thread.sleep(2000);
			System.out.println("Banking..............");
		}
		System.out.println("Banking completed...");
		
		System.out.println("_____________________");
		
		
		System.out.println("Printing  Task started::");
		
		for(int i=0;i<3;i++) {
			Thread.sleep(2000);
			System.out.println("Printing..............");
		}
		System.out.println("Printing completed...");
		
		System.out.println("_____________________");
		
		
		System.out.println("Calculation Task started::");
		
		for(int i=0;i<3;i++) {
			Thread.sleep(2000);
			System.out.println("Calculating..............");
		}
		System.out.println("Calculation completed...");
		
		System.out.println("_____________________");
		
		//in this program we are not achieving multi threading concept
		
	}

}
