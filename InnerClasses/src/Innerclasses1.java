
//Bugs in event handling concepts(GUI) ==> JDK1.1V Inner classes(very powerful)
public class Innerclasses1
{
	class Inner
	{
		public void m1()
		{
			System.out.println("Inner class m1()");
		}
		
		public static void m2()
		{
			
		}
	}
	
	public void m2()
	{
		System.out.println("This is outer method :: m2()");
		
		Inner inner = new Inner();
		
		inner.m1();
	}
	
	public void m3()
	{
		System.out.println("This is outer method:: m3()");
		m2();
	}

	public static void main(String[] args) 
	{
		
		System.out.println("Outer class");
		
		new Innerclasses1().new Inner().m1();
		
		new Innerclasses1().m3();
		
		
	}

}
