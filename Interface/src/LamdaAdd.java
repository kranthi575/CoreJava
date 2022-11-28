@FunctionalInterface
interface Add{
	
	int add(int num1,int num2);
}

public class LamdaAdd {

	public static void main(String[] args) {
		
		
//		Add a=new Add() {
//			
//			public int add(int n,int m) {
//				return n+m;
//			}
//		};
//		
		
		Add a=(n,m)-> {return n+m;};
		
		System.out.println(a.add(1, 2));
		
	}

}
