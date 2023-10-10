package Interview_Questions;

public class Productdigit 
{
	public static int print(int num)
	{
		int sum=1;
		while(num>0)
		{
			int pro= num%10;
			sum = sum*pro;
			num = num/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println(print(1234));
	}
}
