import java.util.*;
class Student implements Comparable<Student>{
	int age;
	String name;
	String tech;
	public Student(int age,String name,String tech) {
	this.age=age;
	this.name=name;
	this.tech=tech;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", tech=" + tech + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	
	
}
public class Gen5 {

	public static void main(String[] args) 
	{
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(21,"ak","java"));
		al.add(new Student(28,"ak1","javar"));
		al.add(new Student(24,"ak1","javar"));
		
		Collections.sort(al);
		
		System.out.println(al.toString());
	}

}
