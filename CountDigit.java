package Interview_Questions;

import java.util.Scanner;
																//use java visualizer for trasing //oct-3-2023
public class CountDigit 
{
	public static int print(int num)
	{
		int c=0;
		while(num>0)
		{
	//		int rem = num%10;			it's not mandatory
			c++;
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
// write a java pgm to count in a given number