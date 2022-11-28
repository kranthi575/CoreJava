import java.io.*;

public class TestApp {

	public static void main(String[] args) throws IOException
	{
		
		File f = new File("tempdir2");
		
		 f.mkdir(); //creating directory
		 
		 
		File f2 = new File("tempdir2","abc.txt");
		
		 f2.createNewFile();	//adding text file within directory
		 
		 System.out.println(f2.exists());

		
	}

}

// windows -> file, folder(directory)

//UNIX -> file,folder (directory)
