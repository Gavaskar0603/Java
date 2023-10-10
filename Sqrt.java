package Interview_Questions;

import java.util.Scanner;

public class Sqrt 
{
	public static boolean check(int n)
	{
		if(n<=1)
		{
			return false;
		}
		else if (n==2 || n==3)
		{
			return true;
		}
		else if(n%2==0 || n%3==0)
		{
			return false;
		}
		for(int i=5;i<=Math.sqrt(n);i=i+2)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number \t");
		int n = sc.nextInt();
		System.out.println(check(n));
		sc.close();
	}
}
