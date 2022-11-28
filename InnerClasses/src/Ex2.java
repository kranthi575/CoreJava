
public class Ex2 
{
	int x=10;//instance variable
	static int y=20;//static variable
	
	public void m1()
	{
		int k=30;//local variable
		class Inner 
		{
			public void m2()
			{
				System.out.println(x);
				System.out.println(y);
				System.out.println(k);
			}
			public static void m3()
			{
				System.out.println("this is static method");
			}
		}
		
		new Inner().m2();
	}

	public static void main(String[] args) 
	{
		
		new Ex2().m1();
	}

}
