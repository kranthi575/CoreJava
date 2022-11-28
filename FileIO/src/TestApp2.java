import java.io.*;

public class TestApp2 
{

	public static void main(String[] args) throws IOException
	{
	
	File f1 = new File("F:\\","IPLTeam");
	
	f1.mkdir();
	
//	f1.renameTo(","IPLTeams");
		
	File f= new File("F:\\IPLTeam","demo.txt");	
	
	f.createNewFile();
	
	/*
	 * Important methods of File Class
	 * 
	 * boolean exists();
	 * boolean createNewFile();
	 * boolean mkdir();
	 * boolean isFile();
	 * boolean isDirectory();
	 * String[] list();
	 * long length();
	 * boolean delete();
	 * 
	 * 
	 */

	}

}
