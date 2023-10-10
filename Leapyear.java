package Pattern;		//Leap and Non-Leap year

import java.util.Scanner;

public class Leapyear 
{
	public static String leap(int year)
	{
		if (year%400==0 || year%100!=0 && year%4==0)
		{
			return "Leap year";
		}
		return "Non-Leap year";
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int year = sc.nextInt();
		System.out.println(leap(year));
		sc.close();
	}
}
