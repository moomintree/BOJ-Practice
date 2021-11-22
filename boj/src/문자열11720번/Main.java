package 문자열11720번;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=Integer.parseInt(br.readLine());
		
		String s=br.readLine();
		int sum=0;
		
		// 배열 생성(count 입력받은 값 개수대로)
		
		for(int i=0;i<count;i++)
		{
			String a[]=s.split("");
			sum+=Integer.parseInt(a[i]);
		}
		
		System.out.println(sum);
	}

}
/*
 * 25
7000000000000000000000000
*/