package Interview_Questions;
			// count factor logic alter
import java.util.Scanner;

public class Count 
{
	public static int count(int num)
	{
		int c=0;
		for (int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		System.out.println(count(n));
		sc.close();
	}

}
