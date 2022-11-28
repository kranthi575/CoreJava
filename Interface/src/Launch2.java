
interface Demo5{
	
	default void disp() {
		System.out.println("hello Im here after JAVA 8");
	}
}
interface Demo3{
	
	//marker interface
	//empty interface
}

interface Demo4{
	
	void disp();
	//functional interface
	//only-one method
}
interface Demo1{
	
	public static final int a=10;
	
	 void disp();
}

interface Demo2 extends  Demo1{
	
	
	void show();
}


public class Launch2 {

}
