
import java.io.*;

/*
 * constructor:
 * 
 * FileReader(File f)
 * FilReader(String Name)
 * 
 * 
 */
public class Filereader1 {

	public static void main(String[] args) throws IOException {
		
		
		FileReader fr = new FileReader("info.txt");
		
		int i = fr.read();
		
		while(i!=-1) {
			
			System.out.println((char)i);
			
			i=fr.read();
			
		}
		
		fr.close();
		//System.out.println(fr.read());
		
		
	}

}
