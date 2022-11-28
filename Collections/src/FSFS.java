import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

//Fail-Safe Fail-Fast
public class FSFS {

	public static void main(String[] args) 
	{
		List al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
			//modifying the data while accessing is called Structural Modification
			//al.add(99);
			//never ending loop 
			//not fail fast
			
			
		}
		
		//example of fail-fast
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		//throws the ConcurrentModificationException
		//it is example of fail-fast
		//al.add(100);
		}
		System.out.println("Fail-Safe");
		//example of fail-safe
		CopyOnWriteArrayList cwa=new CopyOnWriteArrayList();
		
		cwa.add(100);
		cwa.add(300);
		cwa.add("kranthi");
		cwa.add(true);
		
		Iterator itr1=cwa.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
			cwa.add(239);
		}
		System.out.println(cwa);
		
		
		
	}

}
