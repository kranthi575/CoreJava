
import java.util.*;

public class identityhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm=new HashMap();
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		hm.put(i1,"Sachin");
		hm.put(i2,"Messi");
		/*
		 * for HashMap, internally JVM uses equals() method to check the duplicate keys
		 * 
		 * so,it checks the value of the object not the hash codes of the objects
		 */
		System.out.println(hm);
		
		IdentityHashMap idmp=new IdentityHashMap();
		
		Integer j1=new Integer(20);
		Integer j2=new Integer(20);
		
		idmp.put(j1,"Sachin");
		idmp.put(j2,"messi");
		/*
		 * for Identity HashMap,JVM internally uses the '==' operator to check the duplicate keys
		 * 
		 * so,it check the hash codes of the objects instead of object values.
		 * 
		 */
		
		
		System.out.println(idmp);
		
		

	}

}
