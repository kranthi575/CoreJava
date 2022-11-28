public class Ex1 
{
	int a=10;
	
	int x=10;//instance variable of Outer class
	static int y=20;

	class Inner
	{
		int a=20;
		
		int z=30;//instance variable of Inner class
		public void m1()
		{
			int a=30;
			System.out.println(a);//local variable
			System.out.println(this.a);//instance of inner class
			System.out.println(Ex1.this.a);//instance of outer class
			
			int s=40;
			System.out.println(x);
			System.out.println(z);
			System.out.println(y);
			System.out.println(s);
			
			
		}
	}
	
	
	class L1{
		class L2{
			class L3{
				public void m1()
				{
					System.out.println("Method inside L3");
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		
		new Ex1().new Inner().m1();
		
		Ex1 e=new Ex1();
		
		//Ex1.L1 l1=e.new L1();
		
		//Ex1.L1.L2 l2=l1.new L2();
		
		//Ex1.L1.L2.L3 l3=l2.new L3();
		
		new Ex1().new L1().new L2().new L3().m1();
		
		//l3.m1();
	}

}
