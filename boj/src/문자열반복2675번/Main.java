package 문자열반복2675번;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			int count=Integer.parseInt(br.readLine());
			
			
			for(int i=0;i<count;i++)
			{
				String[] sl= br.readLine().split(" ");
				
				int rep=Integer.parseInt(sl[0]);
				String S=sl[1];
				
				for(int j=0;j<S.length();j++)
				{
					for(int k=0;k<rep;k++)
					{
						char ch=S.charAt(j);
						System.out.print(ch);
					}
					
				}
				System.out.println();
			}
			
	}

}
