import java.util.Scanner;

public class SmithNumber {
    static boolean smithnum(int n){
        int sum=0,sum2=0;
        while (n>0){//123  12  1
            int digit=n%10; //3  2  1
            sum+=digit;//sum=3   5   6
            if(Primeno4.primeno(digit)==true){//t=t
                sum2+=digit;//sum2=3   5
            }
            n/=10;//12  1

        }
        if(sum==sum2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(smithnum(num));

    }
}
