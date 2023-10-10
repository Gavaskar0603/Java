import java.util.Scanner;

public class PrimeCountEqualNum {
    static  boolean primeno(int num) {
        if(num<=1){
            return false;
        }
        else if(num==2 || num==3){
            return true;
        }
        else if (num%2==0||num%3==0){
            return false;
        }
        else {
            for (int i = 5; i <=Math.sqrt(num); i += 2) {
                if ((num % i) == 0)
                    return false;
            }
        }
        return true;
    }
    static void primeSries(int n){
        int count=0, i=2;
        while(n>0){//5

            if(primeno(i)==true) {
                count++;//
                System.out.println(i);

            }
            i=i+1;


            if(count==n){
                break;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        primeSries(num);

    }
}
