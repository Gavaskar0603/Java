package Interview_Questions;

import java.util.Scanner;

public class Factor 
{
	public static void print(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			System.out.println(i +" ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		print(num);
		sc.close();
	}
}
