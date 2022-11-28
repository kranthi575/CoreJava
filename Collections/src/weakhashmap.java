import java.util.*;

public class weakhashmap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		HashMap hm=new HashMap();
		//WeakHashMap hm=new WeakHashMap();
		
		Temp1 t=new Temp1();
		
		hm.put(t,"Sachin");
		
		System.out.println(hm);

		t=null;//setting t=null to allow garbage collector to clean obj
	
		System.gc();//garbage collector called
		/*
		 * Garbage Collector is called by JVM
		 * GC went to HashTable to clean but HashMap dominates the GC
		 * And GC won't allow to clean the object
		 * 
		 * But when come to WeakHashMap, GC dominates the WeakHashMap
		 * And, GC clears the null object
		 * 
		 */
		Thread.sleep(5000);
		
		System.out.println(hm);
		
		

	}

}

class Temp1{
	
	@Override
	public String toString()
	{
		return "temp";
	}	
}
