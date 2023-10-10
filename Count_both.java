package Interview_Questions;

import java.util.Scanner;

public class Count_both				//odd & even
{
	public static void print(int num)
	{
		int even=0;
		int odd=0;
		while(num>0)
		{
			int rem = num%10;
			if(rem%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			num = num/10;
		}
		System.out.println("Even count  : "+even);
		System.out.println("Odd count : "+odd);
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		print(num);
		sc.close();
	}
}
