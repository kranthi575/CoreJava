import java.util.*;

public class iterator {
	
	public static void main(String args[])
	{
	
		List l=new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add("kranthi");
		l.add(50);
		
		System.out.println(l);
		
//		for(int i=0;i<l.size();i++) 
//		{
//			
//			System.out.println(l.get(i));
//		}
//		//enhanced for loop  for-each loop
//		for(Object num:l)
//		{
//			System.out.println(num);
//			
//		}
		
		LinkedList ll=new LinkedList();
		
		ll.add("100");
		ll.add("kranthi");
		ll.add("Ineuron");
		ll.add(20);
		ll.add(true);
		
		System.out.println(ll);
		System.out.println("*******ITR*********");
		Iterator itr=ll.iterator();
		
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Object o=itr.next();
			System.out.println(o);
		}
		
		//retrieving  in reverse order
		System.out.println("*********LITR*******");
		ListIterator lt=ll.listIterator(ll.size());
		
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}
		
		//descending iterator
		System.out.println("******DITR******");
		Iterator dt=ll.descendingIterator();
		
		while(dt.hasNext())
		{
			System.out.println(dt.next());
		}
		
	}

}
