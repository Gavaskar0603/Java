package Loop;

import java.util.Scanner;

public class Reverse_number 
{
	public static long reverse(int num)
	{
		int res = 0;
		while (num > 0)
		{
			int rem = num%10;
			res = res*10 + rem;
			num = num/10;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(reverse(num));
		sc.close();
	}
}
