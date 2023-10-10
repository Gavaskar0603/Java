package Gavas;

import java.util.*;

public class Factorial 
{
	public static long fact(int n) //  Q1 ***Factorial of 'a' number
	{
		long result = 1l;
		for(int i=n;i>=1;i--)
		{
			result = result * i;
		}
		return result;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		System.out.println(fact(n));;
		sc.close();
	}
}
