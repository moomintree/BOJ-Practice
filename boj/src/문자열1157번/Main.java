package 문자열1157번;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr=new int[26];
		String S=br.readLine();
		
		for(int i=0;i<S.length();i++)
		{
			if('a' <= S.charAt(i) && S.charAt(i) <= 'z')
			{
				arr[S.charAt(i) - 97]++;
			}
			else
			{
				arr[S.charAt(i) - 65]++;
			}
		}
		
		int max = -1;
		char ch = '?';
		for(int i=0;i<26;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
				ch = (char)(i+65);
			}
		
			else if(arr[i]==max)
			{
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
