import java.io.*;

public class BufferReader {

	public static void main(String[] args) throws IOException
	{
		
		BufferedReader bf = new BufferedReader(new FileReader("abc.txt"));
		
		String line = bf.readLine();
		
		while(line!=null) {
			
			System.out.println(line);
			
			line=bf.readLine();
		}
	}

}
