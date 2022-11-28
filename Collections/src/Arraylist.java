//import java.util.*;
import java.util.ArrayList;


public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a1=new ArrayList();
		
		a1.add("d");
		a1.add("Ineuron");
		a1.add(10);
		a1.add(true);
		a1.add(9);
		
		System.out.println(a1);//[d, Ineuron, 10, true, 9]
		
		ArrayList a2=new ArrayList();
		
		a2.add(10);
		a2.add(20);
		a2.add(30);
		
		System.out.println(a2);//[10,20,30]
		
		a1.addAll(a2);
		
		System.out.println(a1);
		
		System.out.println(a1.contains("d"));//checking data present inside or not
		
		System.out.println(a1.get(1)); // retrieving through indexing
		
		System.out.println(a1.isEmpty()); //checking empty or not
		
		System.out.println(a1.size()); // returning size
		
		System.out.println(a1.getClass()); //returns class
		
		ArrayList a3=new ArrayList();
		
		a3.add("Bengaluru");
		a3.add("IT");
		a3.add(15);
		
		String str=a3.toString();
		
		System.out.println(a3.get(1));
		
		a3.clear();

		System.out.println(a3);
		System.out.println(a3.isEmpty());
		
		a3.ensureCapacity(3);
		a3.add("Bengaluru");
		a3.add("IT");
		
		a3.add(1,"inserted");//inserting at index
		System.out.println(a3);
		
		
		
		
		

	}

}
