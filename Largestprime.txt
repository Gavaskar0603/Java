import java.util.Scanner;

public class LargestPrime {

   static int largestprime(int n){//10
       int temp=0;
       for(int i=2;i<=n/2;i++) {
           //System.out.println(i);
           if (n % i == 0 && Primeno4.primeno(i) == true) {//10%2==0    10%5==0
               if (temp < i) {//0<2   2<5
                   temp = i; //temp=2   temp=5
               }
           }
       }
       return temp;//5

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(largestprime(num));
    }
}
