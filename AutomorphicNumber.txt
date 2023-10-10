import java.util.Scanner;

public class AutomorphicNumber {

    static boolean automorphic(int n){//25*25=625
        int digit1=0,digit2=0;
        digit1=n%10;
        int N=n*n;
        digit2=N%10;
        System.out.println(n+" "+N);
        if(digit1==digit2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(automorphic(num));

    }
}
