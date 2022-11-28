
import java.util.*;

class Gen<T>{
	
	T obj;
	
	Gen(T obj)
	{
		this.obj=obj;
	}
	
	public  void show() {
		System.out.println("The type of object is ::"+obj.getClass().getName());
	}
}

class Gold
{	
}
class Silver
{	
}
class Materials<m>
{
	m obj;
	Materials(m obj)
	{
		this.obj=obj;
	}
	public  void show() {
		System.out.println("The type of object is ::"+obj.getClass().getName());
	}
	
}


public class Gen2 {

	public static void main(String[] args)
	{
		Gold go=new Gold();
		
		Materials<Gold> gold=new Materials<Gold>(go);
		
		gold.show();
		
		Gen<String> g=new Gen<String>("abc");
		
		g.show();
		
		Gen<Integer> g1=new Gen<Integer>(10);
		
		g1.show();

		
	}

}
