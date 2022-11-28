
//@FunctionalInterface
//interface CLS{
//	
//	int getLength(String s);
//}

class Computer{
	
	public void config() {
		
		System.out.println("i7,12GB,1TB");
	}
}

public class AnnonymousInnerClass {
	
	
	public static void main(String args[]) {
		
//		CLS c=new CLS() {
//			
//			public int getLength(String s) {
//				
//				
//				int res=s.length();
//				return res;
//			}
//			
//		};
//		
//		String str="kranthi";
//		
//		System.out.println("The length of string :"+c.getLength(str));
//		
		
		Computer c=new Computer() {
			
			public void config() {
				System.out.println("i9,16GB,1TB");
			}
		};
		
		c.config();
		
		
	}

}
