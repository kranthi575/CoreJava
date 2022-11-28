import java.io.*;
public class Bufferwriter
{

	public static void main(String[] args) throws IOException
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
		
		bw.write(73);
		
		bw.write("Neuron");
		bw.newLine();
		
		bw.write("technology");
		
		
		char[] ch= {'a','b','c'};
		
		bw.write(ch);
		
		bw.flush();
		bw.close();
		
		// TODO Auto-generated method stub

	}

}
