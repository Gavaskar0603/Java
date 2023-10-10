package Interview_Questions;

import java.util.Scanner;

public class Count_factor 
{
	public static int count(int num)
	{
		int count = 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		System.out.println(count(num));
		sc.close();
	}
}
