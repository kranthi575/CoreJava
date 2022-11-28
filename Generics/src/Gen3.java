class T{
	
}
class Demo<T extends Number>
{
	T obj;
	
	Demo(T obj){
		this.obj=obj;
	}
	
}
public class Gen3 {

	public static void main(String[] args)
	{
		T t=new T();
		//Demo<T> d1=new Demo<T>(t);
		
		Demo<Integer> d2=new Demo<Integer>(10);
		
		
	}

}
