import java.util.Scanner;

public class CircluerPrime {
    static  int check(int n){
        int count=0;
        while(n>0) {
            n=n/10;
            count++;
        }
       return count;
    }
    public static int pow(int a,int b){
        int pow=1;
        for(int i=1;i<=b;i++){
            pow*=a;
        }
        return pow;
    }
   static boolean check2(int n)
    {
        if(n<=1){
            return false;
        }
        else if(n==2 || n==3){
            return true;
        }
        if(n%2==0||n%3==0){
            return false;
        }
        for (int i = 5; i < Math.sqrt(n); i+=2) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }
    static boolean rotatenumber(int n) {//1193 3119   9311   1931
        int c = check(n);
        int n2=0,count=0;
       for(int i=1;i<=c;i++){//1<4  2<4
            int n1 = n % 10;//n1=3  n1=9
            n2= n / 10;//n2=1193/10=119
            n= n1 * pow(10, (c-1)) + n2;//n=3*1000+119=3119
            if(check2(n)==true) {  //3119==true
                count++;
            }
            else {
                break;
            }
        }
        if(c==count) {
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        CircluerPrime c=new CircluerPrime();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(c.rotatenumber(num));

    }
}
