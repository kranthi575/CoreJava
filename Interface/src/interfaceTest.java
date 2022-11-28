interface D{
	
    
        
}

interface B{
	
}
interface C{
	
	void add();
}

abstract class F implements C{
	
	
}

//class fem extends f{
//	
//}
interface A extends B{
	
}

interface Sam{
	
	 int a=10;
	
	public abstract void sub();
	
	default public  void add() {
		System.out.println("this is addition method");
		sub1();
	}
	
	private void sub1() {
		
		System.out.println("private");
		
	}
	
	static void mul() {
		System.out.println("this is multi");
	}
}


class Chay implements Sam{
	
	
	public void sub()
	{
		
	}	
}

@FunctionalInterface
interface Geek
{
	public void disp();
	
	public String toString();
		
}


public class interfaceTest {

	public static void main(String[] args) {
		
		
		
		Geek g=new Geek() {
			
			public void disp() {
				
				System.out.println("thi is dips");
				
			}
			
		};
		
		g.disp();
		
	
		

}
}


