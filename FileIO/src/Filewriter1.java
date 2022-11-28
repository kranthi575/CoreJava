import java.io.*;

/*
 * 
 *  Constructors:
 * 
 * FileWriter(String name)
 * FileWriter(File f)
 * FileWriter(String name,boolean append)
 * FileWriter(File f,boolean append)
 * FileWriter(File f,boolean append)
 * 
 *  
 *  Methods:
 *  
 *  write(int ch)
 *  write(char[] ch)
 *  write(string data)
 *  flush()
 *  close()
 *  
 *  
 */
public class Filewriter1 {

	public static void main(String[] args) throws IOException
	{
		
	FileWriter fw = new FileWriter("info.txt");
	
	fw.write("79");
	
	fw.write("\nIneuronTechnology");
	
	fw.write("\n");
	
	char[] ch= {'a','b','c'};
	
	fw.write(ch);
	
	fw.flush();
	fw.close();
	
	
	
	
	}

}
