import java.io.*;

/*
 * PrintWriter:
 * 
 * (string str)
 * (File file)
 * (Writer writer)
 * 
 * 
 * 
 * 
 */
public class printWriter 
{

	public static void main(String[] args) throws IOException
	{
		FileWriter fw= new FileWriter("cricket.txt");
		
		PrintWriter out = new PrintWriter(fw);
		
		
		
	}

}
