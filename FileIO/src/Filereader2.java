import java.io.*;

public class Filereader2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("info.txt");
		
		char[] ch=new char[10];
		
		fr.read(ch);
		
		for(char c:ch) {
			System.out.print(c);
		}
		
		fr.close();
		

	}

}
