import java.util.*;

public class map {

	public static void main(String[] args) {
		
		//insertion order is not preserved
		//Map mp=new HashMap();
		
		//insertion order is preserved
		LinkedHashMap mp=new LinkedHashMap();
		
		mp.put(10,"sachin");
		mp.put(7,"dhoni");
		mp.put(18,"kohli");
		mp.put(45, "rohit");
		
		System.out.println(mp); //mp.toString() will be called
		
		System.out.println("***Keys***");
		
		Set s=mp.keySet();//method gets executed and the object is created at runtime
		//key's are collecting in one of the  set interface method
		
		System.out.println(s);
		
		System.out.println(s.getClass().getName());
		
		System.out.println("***Values***");
		Collection c=mp.values();//to get the values from map
		
		System.out.println(c);
		
		System.out.println(c.getClass().getName());
		
		System.out.println("***EntryData***");
		
	 
		
		Set entryData=mp.entrySet();
		
		System.out.println(entryData);//to get the K,V from map in Set 
		
		
		Iterator itr=entryData.iterator();
		
		
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry data=(Map.Entry)itr.next();
			
			System.out.println(data.getKey()+":"+data.getValue());
			//no concurrent modification error bcz method is available in object
			if(data.getKey().equals(10))
				data.setValue("Messi");
		}
		
		System.out.println(mp);
		
		System.out.println("***inserting null***");
		
		mp.put(null,0);
		
		System.out.println(mp);
		
		mp.put(null,"Abc");
		
		System.out.println(mp);
		
		

	}

}
