import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable
{
	static int i = 10;
	int j= 20;
	
	transient int x=60;
	
	static transient int y=50;
	
	//transient will only applicable for variables 
	//transient 
	static transient final int k=10;
	
	public Dog()
	{
		System.out.println("Dog constructor");
	}
}
class Cat implements Serializable
{
	int i = 10;
	int j= 20;
	
	public Cat()
	{
		System.out.println("Cat constructor");
	}
}
public class Serialization1 
{

	public static void main (String[] args) throws IOException,ClassNotFoundException
	{
		Dog d = new Dog();
		Cat c=new Cat();		
		System.out.println("Seralization started");
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(d);
		
		oos.writeObject(c);

		
		System.out.println();
		
		System.out.println("Deseralization started");
		
		FileInputStream fis = new FileInputStream("abc.ser");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//Cat c1 =(Cat)ois.readObject();
		
		Dog d1 =(Dog)ois.readObject();
		
		Cat c1 =(Cat)ois.readObject();
		
		
		System.out.println("Desealization ended");
		
		System.out.println(d1.i+"======="+d1.j);
		
		System.out.println("Transient variable"+d1.k);
		
		System.out.println("Transient variable"+d1.j);


		System.out.println(c1.i+"======="+c1.j);
		
		System.out.println();
	}

}
