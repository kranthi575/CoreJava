/*
 * Interface:
 * 1.pure abstract methods
 * 2.100% abstractions
 * 3.helps to achieve standardization
 * 4.can act as blue print
 * 5.all methods public abstract
 * 6.Interface can extends other interface but cannot implements
 * 7.interface can have variable(public static final int a=10)
 * 8.marker interface or tagged interface (empty interface)
 * 9.Functional Interface (contains only one method)
 * 
 */

/*
 * FROM JAVA 8.0:
 * ->Interface can have method within body (with keyword default)
 * -> Interface can have Static methods
 * 
 * From JAVA 9.0
 * ->Interface can have private method (private)
 */

/*
 * Difference between Abstract vs Interface
 * 
 * Abstract:
 * 1.It is a class, so multiple inheritance is not allowed
 * 2.here methods are not by default  public abstract
 * 3.Abstract class can have constructor
 * 4.Every variable is not public static final
 * 
 * Interface:
 * 1.It allows multiple inheritance
 * 2.here by default public abstract
 * 3.It didn't have constructor
 * 4.every variable is public static final
 * 
 */


abstract class sample3 implements methods{
	
	public sample3() {
		//constructor
	}
	int a;
	public void disp() {
		
	}
	
}

//all methods in interface
interface methods{
	
	//abstract method: to indicate the child class to give implementation
	public abstract void disp();
	
	//default methods: interface only will give dummy implementation
	default void show() {
		System.out.println("I'm default method");
	}
	
	//private method: interface default method body is reused inside interface multiple times
	private void samp(){
		System.out.println("I'm private method");
	}
	
	//static method: Interface will give implementations which child should use it as it is..
	static void sample() {
		System.out.println("I'm static method");
	}
}
interface sample2{
	public static void show() {	
	}
	default void disp() {
		privatemethod();
	}
	private void privatemethod() {
		//This method can call only inside the interface 
		//It can't be override or It can't implements in child class
	}
}
interface sample1{
	
	static void show() {
		//As you know I'Static I can't Override :)
		System.out.println("I am static method inside Interface");
	}
	default void disp() {
		//I can be override if want while implementations
		System.out.println("wowww!I'm method and suprisingly I'm inside interface");
	}
}


//@MarkerInterface

interface empty{
	//marker interface
	//empty interface
}
interface Demo10 {
	//Functional Interface
	//It contains only one method 
	int disp();
	
}
interface Demo extends Demo10{
	
	public abstract void add();
	void sub();
	public static final int b=10;
	int a=10;
	
}

class Sample implements Demo{
	
	public void add() {
		
	}
	public void sub() {
		
	}
	public int disp() {
		return 0;
	}
	
	
}
public class Inteface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}


//Encapsulation = abstraction + polymorphism



