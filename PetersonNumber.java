import java.util.Scanner;

public class PetersonNumber {
     public  static int  factorial(int n){
        int f=1;
        while(n>0){
            f=f*n;
            n--;
        }
        return f;
    }
    public static boolean petersonnum(int n){
        int sum=0,num=n;
        while(n>0){
            int digit =n%10;
            sum+=factorial(digit);
            n/=10;
        }
        if(sum==num)
        {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println(petersonnum(num));

    }
}
