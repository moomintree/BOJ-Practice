package 문자열1152번;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		/*
		String[] S=br.readLine().split(" ");
		int sum=0;
		
		for(int i=0;i<S.length;i++)
		{
			if(S[i]=="")
			{
				continue;
			}
			else
			{
				sum+=1;
			}
		}
		System.out.println(sum);
		*/
		String B=br.readLine();
		StringTokenizer st=new StringTokenizer(B," ");
		
		System.out.println(st.countTokens());
		
	}

}
