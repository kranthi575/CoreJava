import java.io.*;


//with using transient their is loss of data.
//to prevent this we use customised searlization
class Account implements Serializable{
	
	String name="Sachin";
	transient String enpwd="abc123";
	String pwd;
	
	private void writeObject(ObjectOutputStream oos) throws Exception
	{
		System.out.println("Hey!I am using while serialization");
		
		oos.defaultWriteObject();
		
		String enpwd1 = 123+"password";
		
		oos.writeObject(enpwd);
		//oos.writeInt(0);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception
	{
		System.out.println("Hey!I am using while desearlization");
		
		ois.defaultReadObject();//all object will be read
		
		String enpwd1=(String)ois.readObject();
		
		pwd= enpwd1.substring(3);
		
	}
}


public class serialization2 {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
		
		Account acc = new Account();
		
		FileOutputStream fos = new FileOutputStream("account.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(acc);
		
		
		
		FileInputStream fis = new FileInputStream("account.ser");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Account acc1 = (Account)ois.readObject();
		
		System.out.println("UserName"+acc1.name+"\n password:"+acc1.pwd);
			

	}

}
