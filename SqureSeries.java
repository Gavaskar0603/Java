import java.util.Scanner;

public class SqureSeries {
    static  void  squreser(int n){
        for(int i=1;i<=n;i++){
            int squre=i*i;
            System.out.print(squre+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        squreser(num);

    }
}
