package Interview_Questions;

import java.util.Scanner;

public class CountEven 
{
	public static int print(int num)
	{
		int c=0;
		while(num>0)
		{
			int rem = num%10;
			if(rem%2==0)
			{
				c++;
			}
			num = num/10;
		}
		return c;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		System.out.println(print(num));
		sc.close();
	}
}
