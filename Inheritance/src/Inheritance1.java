
abstract class Person{
	
	public abstract void m1();
	
	public abstract void m2();
	
	public  abstract void m3();
	
	
}
class Student extends Person{
	
	//overriden methods(abstract methods)
	public void m1() {}
	public void m2() {}
	public void m3() {}
	
	//specialized methods
	public void m4() {}
	public void m5() {}
	
}

class Employee extends Person{
	//overriden methods(abstract methods)
	public void m1() {}
	public void m2() {}
	public void m3() {}
	
	//specialized methods
	public void m4() {}
	public void m5() {}
	
	
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//can have access to all methods
	Student stud = new Student(); //tight-coupling - creating object of child class and collecting in child class reference
	
	//stud.m5(); ::NO ERROR::
	
	Employee emp=new Employee();//Tight-coupling :: it is fixed at compile time only it is employee object so it did not have access to other methods
	
	//can have only access to only  parent methods that implemented in child class
	Person person = new Student();//loose-coupling - creating object of child class and collecting in parent class refrence
	
	
	//person.m5(); ::ERROR::
	
	
			//p=new Student();
			//p=new Employee();
	Person p; //Loose coupling **At the run time one of the implementation object will be created**
	//RUntime object creations
	//p.m3();
	

	}

}
