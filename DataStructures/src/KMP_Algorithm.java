
/*
 *Knuth Morris Pratt Algorithm
 *LPS - Longest Prefix Suffix
 *Finding String Pattern in given Text
 *
 *String Pattern Matching:KMP Algorithm
 *
 *LPS[]-at most increase by one
*/
public class KMP_Algorithm {
	
	

	
	public static void main(String args[])
	{
		String text="Hellokranthi kranthi ! my name is kranthi";
		
		String pattern="kranthi";
		
		int pattern_len=pattern.length();
		int text_len=text.length();
		int n=pattern_len+text_len+1;
		
		int LPS[]=new int[n];
		
		String fin=pattern+"$"+text;
		
		LPS[0]=0;
		for(int i=1;i<n;i++)
		{
			int x=LPS[i-1];
			
			while(fin.charAt(x)!=fin.charAt(i)) 
			{
				if(x==0)
				{
					x=-1;
					break;
				}
				x=LPS[x-1];
			}
			LPS[i]=x+1;
			
		}
		
		
	for(int i:LPS)
	{
		//System.out.print(i);
		if(i==pattern_len)
			System.out.println("true");
		
	}
		
		
		
		
	
	}
}
