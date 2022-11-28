
import java.util.*;
/*
 * BST  O(log n) 
 * follows In-order 
 * 
 * order of insertion not maintained
 * ascending order
 * Duplicates are not allowed
 * null is also not allowed
 * 
 * implements set interface
 * sortset <- set
 */
public class treeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet ts=new TreeSet();
		ts.add(30);
		ts.add(100);
		ts.add(40);
		ts.add(150);
		ts.add(60);
		ts.add(125);
		ts.add(175);
		ts.add(35);
		ts.add(15);
		ts.add(20);
		System.out.println(ts);
		
		TreeSet ts1=new TreeSet();
		
		ts1.add(35);
		ts1.add(50);
		ts1.add(40);
		
		System.out.println(ts.higher(30));//always give higher value
		System.out.println(ts.ceiling(30));//gives the nearest higher value
		System.out.println(ts.floor(20));
		System.out.println(ts.lower(20));
		
		
		

	}

}
