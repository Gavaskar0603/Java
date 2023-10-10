package Interview_Questions;
														//oct-3-2023
public class EvenDigits 
{
	public static void print(int num)
	{
		while(num>0)
		{
			int rem = num%10;
			//if(num%2==1)//odd
			if(num%2==0)//even
			{
				System.out.println(rem+" ");
			}
			num = num/10;
		}
	}
	public static void main(String[] args) {
		print(74645473);
	}
}
