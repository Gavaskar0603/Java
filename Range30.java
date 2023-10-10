package Gavas;

import java.util.Scanner;

public class Range30 
{
	public static int check(int num,int key)
	{
		int count=0;
		for(int i=0;i<=num;i++)
		{
			if(i/10==key)
			{
				count++;
			}
			if(i%10==key)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		System.out.println("Enter the key : ");
		int key = sc.nextInt();
		System.out.println(check(num,key));
		sc.close();
	}
}
