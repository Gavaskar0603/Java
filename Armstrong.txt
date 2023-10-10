import java.util.Scanner;

public class ArmstrongNumber {
    public static int checkDigit(int n){
        int count=0;
        while(n>0) {
            n=n/10;
            count++;
        }
        return count;
    }
    public static int pow(int a,int b){//1   1
        int pow=1;
        for(int i=1;i<=b;i++){
            pow*=a;
        }
        return pow;
    }
    public static boolean armstrongno(int n){
        int rem;
        int sum=0;
        int temp=n;
        //dynamic logic
        while(n>0){
            rem=n%10;
            sum+=pow(rem,checkDigit(temp));
            n=n/10;
        }
        if(sum==temp){
            return true;
        }
        return false;
    }

    public static void main(String[]agrs){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(armstrongno(num));
    }
}
