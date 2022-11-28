import java.io.*;

class Account implements Serializable
{

	String name="sachin";
	transient String password="tendulkar";
	transient int pin=4444;

	private void writeObject(ObjectOutputStream oos) throws Exception
	{
		oos.defaultWriteObject();//All the properties will be written

		String enpwd = 123+password;
		int epin =  1234+pin;

		oos.writeObject(enpwd);//writing the encrypted data
		oos.writeInt(epin);//writing the encrypting pin
	}

	private void readObject(ObjectInputStream ois) throws Exception
	{
		ois.defaultReadObject();//All the properties will be written

		//enpwd = "123tendulkar";
		String enpwd = (String)ois.readObject();

		//epin = 1234+4444 = 5678
		int epin=ois.readInt();//performing decryption
		
		
		password = enpwd.substring(3);
		pin = epin-1234;
	}
}

public class TestApp 
{
	public static void main(String[] args)throws Exception 
	{
		Account acc =new Account();
		

		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(acc);
		
		System.out.println("Serialization ended");


		System.out.println();

		System.out.println("DeSerialization started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Account acc1 = (Account)ois.readObject();
		
		System.out.println("DeSerialization ended");
		System.out.println(acc1.name + "====> " + acc1.password+"===> "+acc1.pin);
		
		
	}
}
