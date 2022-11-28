import java.io.*;
import java.security.spec.ECFieldF2m;

//Counting number of files&directory present inside directory
public class TestApp3 
{

	public static void main(String[] args) throws IOException
	{
		
		File f = new File("F:\\JKOverseasConsultancy");
		
		String[] data = f.list();
		
		int dCount = 0;
		int fCount = 0;
		
		for(String fileInfo:data) {
			
			File f2 = new File(f,fileInfo);
			
			if(f2.isDirectory()) {
				
				dCount++;
				System.out.println(fileInfo);
				
			}else if(f2.isFile()) {
				fCount++;
				
			}
		}
		

		System.out.println("No of directories are :: "+dCount);
		System.out.println("No of directories are :: "+fCount);
		
		
	}

}
