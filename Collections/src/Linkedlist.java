import java.util.*;

class Node{
	
	int data;
	Node next;
	String nxtAdd;
	
}

class Create{
	
	public Create() 
	{
		
	}
}



public class Linkedlist {

	public static void main(String[] args) 
	{
		Node n1=new Node();
		n1.data=10;
		
		
		
		LinkedList L1=new LinkedList();
		
		L1.add(25);
		L1.add("Kranthi");
		L1.add("m");
		L1.add("Hyderabad");
		
		System.out.println(L1);
		
		L1.add(2,70);
		System.out.println(L1);
		
		L1.addFirst("iNeuron");
		L1.addLast("Lastone");
		
		System.out.println(L1);
		
		L1.add("adding");
		L1.offer("Offering");
		//diff btwn add & offer , add makes adding element mandatory 
		//offer will check availability if yes added else no it won't add
		
		System.out.println(L1);
		
		
	}
}
