package Gavas;
import java.util.Scanner;

public class fibonacci_series {
	
	public static void print(int n) {
		int n1=0;
		int n2=1;
		System.out.print(n1+"\t"+n2);
		for(int i=1;i<=n-2;i++) {
			int n3=n1+n2;
			System.out.print("\t"+n3);
			n1=n2;
			n2=n3;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int n=sc.nextInt();
		print(n);
		sc.close();

	}

}
