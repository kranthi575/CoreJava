

abstract class Demo{
	
	int a=1;
	abstract int shoe();
	
	public void disp() {
		
		System.out.println("Hello this is abstarct class");
	}
}

class Demo3 extends Demo{
	
	public int shoe() {
		return 10;
	}
	
}
public class abstract1 {

	public static void main(String args[]) {
	Demo3 d=new Demo3();
	
	d.disp();
	
	System.out.println(d.a);
	
}
}