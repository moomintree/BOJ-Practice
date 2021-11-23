package 함수10809번;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int[] arr= new int[26];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=-1;
		}
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String alpha=br.readLine();
		for(int i=0;i<alpha.length();i++)
		{
			char al=alpha.charAt(i);
			
			if(arr[al-'a']==-1)
			{
				arr[al - 'a']=i;
			}
			
			
		}
		for(int num:arr) {
			System.out.print(num + " ");
		}
	}

}
