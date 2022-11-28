import java.util.ArrayDeque;

public class Arraydeque 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayDeque ad=new ArrayDeque();
		
		ad.add("e");
		
		ad.add("hello");
		
		ad.add(23);
		
		System.out.println(ad);
		
		ad.addFirst("First adding..");
		ad.addLast("Last adding..");
		
		System.out.println(ad);
		
		
	}

}
