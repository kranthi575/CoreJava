
public class InnerMethod 
{

	
	public void method(int x)
	{
		int y=x;
		
			class Demo
			{
				
				public void demo(int y) 
				{
					System.out.println("this is demo method :: "+y);
				}
			}
			
		new Demo().demo(y);

		
	}
	public static void main(String[] args) 
	{
		
		new InnerMethod().method(10);

	}

}
