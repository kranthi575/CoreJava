import java.util.*;
/*
 * vector
 * stack
 * queue
 *  these are legacy classes
 *  
 *  uses Enumerator operator for iterating data 
 *  
 *  collections uses Iterator
 *  
 *  LegacyClasses uses Enumerator
 * 
 * 
 */
public class LegacyClasses {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add(100);
		v.add(23);
		v.add(12.9);
		v.add("Kranthi");
		
		Enumeration en = v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		
	}

}
