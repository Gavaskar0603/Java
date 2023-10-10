package Gavas;

import java.util.Scanner;

public class power {
	
	public static int pow(int b,int p) {
		
		int res=1;
		for(int i=1;i<=p;i++) {
			res=res*b;
		}
		
		return res;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		int b=sc.nextInt();
		int p=sc.nextInt();
		System.out.println(pow(b,p));
		sc.close();
	}
	
	

}
