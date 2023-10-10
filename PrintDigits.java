package Interview_Questions;

import java.util.Scanner;

public class PrintDigits 
{
	public static int print(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);        
        System.out.println("Enter a value");
        int num = sc.nextInt();
		System.out.println(print(num));
		sc.close();
	}
	
}
