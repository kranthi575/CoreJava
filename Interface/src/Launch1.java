interface Calculator1{
	
	
	public abstract void add();
	
	void sub();
}
interface Calculator2 extends Calculator1{
	
	void div();
	
	void mul();
	
}
class Programmer1 implements Calculator1{
	
	public void add() {
	System.out.println("add method of prog1");	
	}
	public void sub() {
		
		System.out.println("sub method of prog1");
	}
	
}
class Programmer2 implements Calculator1,Calculator2{
	
	public void add() {
		System.out.println("add method of Prog2");
		
	}
	public void sub() {
		
		System.out.println("sub method of prog2");
		
	}
	public void mul() {
		System.out.println("mul method of prog2");
	}
	public void div() {
		System.out.println("div method of prog2");
		
	}
}

class Mycalci{
	
	public void permit(Calculator2 ref) {
		
		ref.add();
		ref.sub();
		ref.mul();
	}
}


public class Launch1 {

	public static void main(String args[]) {
		
		Programmer1 p1=new Programmer1();
		
		Programmer2 p2=new Programmer2();
		
		Mycalci calci=new Mycalci();
		
		calci.permit(p2);
		
		
		
		
	}
	
}
