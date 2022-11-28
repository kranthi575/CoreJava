import java.util.*;

public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable ht=new Hashtable();
		
		ht.put(30,"kra");
		ht.put(10, "sachin");
		ht.put(20, "dhoni");
		
		//null key or value is not allowed in Hashtable 
		//ht.put(45, null);
		
		System.out.println(ht);
		

	}

}
