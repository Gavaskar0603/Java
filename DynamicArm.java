package Interview_Questions;

import java.util.Scanner;

public class DynamicArm 
{
	public static boolean check(int num)
	{
		int c=0;
		int sum=0;
		int t1=num,t2=num;
		while(t1>0)
		{
			//int rem = t1%10;
			c++;
			t1 = t1/10;
		}
		while(t2>0)
		{
			
			int rem = t2%10;
			//sum = sum+(int)Math.pow(rem, c);		---> this pre-define method
			sum = sum+pow(rem,c);
			t2 = t2/10;
		}  
		
		System.out.println(num+"  --->  "+sum);
		
		if(num==sum)
		{
			return true;
		}
		return false;
	}
	public static int pow(int b,int p) 		//	---> user-define method
	{
		int res = 1;
		for(int i=1;i<=p;i++)
		{
			res = res*b;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println(check(num));
		sc.close();
	}
}
