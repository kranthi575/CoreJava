interface Person{
	
	void name();
	void age();
}

class Student  implements Person{
	
	int marks;
	public void name() {
		
	}
	public void age() {
		
	}
	public void marks() {
		
	}
}

class Employee implements Person{
	int salary;
	public void name() {
		
	}
	public void age() {
		
	}
	public void salary() {
		
	}
	
}

class RuntimeObjectCreation{
	
	public void call(Person p) {
		p.name();
		p.age();
	}
}
public class Inheritance2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Object obj =Class.forName("Student").newInstance();
		ClassName c=(ClassName)obj;
		
		RuntimeObjectCreation r=new RuntimeObjectCreation();
		
		r.call(obj);
		

	}

}
