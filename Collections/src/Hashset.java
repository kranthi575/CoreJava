import java.util.*;
/*
 * internally follows HashTable & HashFunction
 * HashTable contains each location stores single data
 * for searching operation is uses Hash function 
 * Hash Function helps map to direct store location 
 * time complexity : O(1)
 * 
 * 
 * LinkedHashSet also uses Hashing algorithm
 * added in 1.4
 *  
 *  main diff 
 *  LinkedHashSet maintain order of insertion
 *  
 * 
 */
public class Hashset {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		HashSet hs=new HashSet();
		
		hs.add(250);
		hs.add(100);
		hs.add(150);
		hs.add(25);
		hs.add(175);
		hs.add(90);
		
		System.out.println(hs);
		
		if(hs.contains(90))
			System.out.println("Trueeeeee");
		
		if(!hs.contains(30))
			System.out.println("30 Falseeeee");
		
		LinkedHashSet ls=new LinkedHashSet();
		
		ls.add(140);
		ls.add(50);
		ls.add(200);
		ls.add(25);
		ls.add(175);
		
		System.out.println(ls);

	}

}
