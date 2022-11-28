@FunctionalInterface
interface Film{
	
	public void show();
	
	public static void disp() {
		
	};
	
}

class Cinema{
	
	
	public void show(String film)
	{
		System.out.println(film);
	}
	
	public Cinema()
	{
		
	}
	
	public Cinema(String str)
	{
	
		show(str);
	}
	
	
}


public class Inheritance3 {

	public static void main(String[] args) {
		
	
		Cinema c1=new Cinema();
		
		//Cinema c2=new Cinema("RRR");
		
		
	}

}
