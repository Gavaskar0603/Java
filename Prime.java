package Interview_Questions;

import java.util.Scanner;		// check the given numbers are Prime or Not......

public class Prime 
{
	public static String check(int num)
	{
		int c=0;
		for (int i=2;i<=num-1;i++)
		{
			if (num%i==0)
			{
				c++;
			}
		}
		if(num!=1 && c==0)
		{
			return "Prime number";
		}
		else
		{
			return "Not a Prime number";
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		System.out.println(check(n));
		sc.close();
	}
}
