package Interview_Questions;

public class Star {
	public static void print(int row,int column)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		print(4,4);
	}
}
