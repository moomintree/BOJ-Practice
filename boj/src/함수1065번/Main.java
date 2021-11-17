package 함수1065번;
/*
 *  어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
 *  등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 *  N이 주어졌을 때,
 *  1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 */
import java.io.*;


public class Main {

	public static int cal(int innum)
	{
		int hansoo=0;
		
		if(innum<100)
		{
			return innum;
		}
		else
		{
			hansoo=99;
			if(innum==1000)
			{
				innum=999;
			}
			
			for(int i=100;i<=innum;i++)
			{
				int one=i%10;
				int ten=(i/10)%10;
				int hun=i/100;
				
				if((one-ten)==(ten-hun))
				{
					hansoo++;
				}
			}
		}
		return hansoo;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int innum=Integer.parseInt(br.readLine());
		System.out.println(cal(innum));
	
	}

}
