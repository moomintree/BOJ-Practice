package 문자열2908번;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] S=br.readLine().split(" ");
		String S1="";
		String S2="";
		String revS1="";
		String revS2="";
		
		for(int i=2;i>=0;i--)
		{
			S1=S[0];
			S2=S[1];
			revS1+=S1.charAt(i);
			revS2+=S2.charAt(i);
		}
		int num=(Integer.parseInt(revS1)>Integer.parseInt(revS2))?Integer.parseInt(revS1):Integer.parseInt(revS2);
		System.out.println(num);
		
		/*
		BufferredReader br = new Bufferedreader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ")
		
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.print(A > B ? A:B);
		 */
	}

}
