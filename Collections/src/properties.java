import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class properties {

	public static void main(String[] args) throws Exception {
		
		
		Properties p=new Properties();//properties object is created
		
		FileInputStream fis=new FileInputStream("database.properties");
		
		//Data loaded into properties object through fis
		p.load(fis);
		
		System.out.println(p);
		
		System.out.println("Password:"+p.getProperty("password"));
		
		p.setProperty("Owner", "Kranthi");
		
		FileOutputStream fos=new FileOutputStream("database.properties");
		
		p.store(fos,"data modified");
		
		
		
		
		
	}

}
