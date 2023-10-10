package Loop;

import java.util.Scanner;

public class Special_number 
{
	public static String check(int num)
	{
		int sum=0;
		int temp= num;
		while(temp>0)
		{
			int rem=temp%10;
			int fact = 1;
			for (int i=rem;i>=1;i--)
			{
				fact = fact*i;
			}
			sum = sum+fact;
			temp = temp/10;
		}
		if(num==sum)
		{
			return "Special number";
		}
		else
		{
			return "No Special number";
		}
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
