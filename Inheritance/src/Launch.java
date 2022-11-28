
class Demo1{
	
	int a,b,c;
	
	public Demo1() {
		a=10;
		b=12;
		c=a+b;
	}
	
	public Demo1(int x,int y) {
		c=x+y;
	}
	
	
}
class Demo2 extends Demo1{
	
	int m,n,o;
	
	public Demo2() {
		this(13,2);
		m=12;
		n=1;
		o=m+n;
	}
	
	public Demo2(int x,int y) {
		super(10,20);
		o=x+y;
		

	}
	
	public void disp(){
		
		System.out.println("Print c:"+c);
		System.out.println("print o:"+o);
	}
		
}




public class Launch {
	
	public static void main(String args[]) {
		
		Demo2 d=new Demo2();
		d.disp();
	}
	

}
