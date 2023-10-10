import java.util.Scanner;

public class Primenoseries {
    //print prime no within given no
    static  void primeno(int num) {
        for (int j = 1; j <= num; j++) {
        if (j <= 1) {
            continue;
        } else if (j == 2 || j == 3) {
            System.out.println(j);
        }
        if (j % 2 == 0 || j % 3 == 0) {
            continue;
        }
        for (int i = 5; i < Math.sqrt(j); i += 2) {
            if ((j % i) == 0) {
                continue;
            }
        }

        System.out.println(j);
    }


}
    static void primeseries(int num){
        for(int i=1;i<=num;i++){
            int r=0;
            for(int j=2;j<=i-1;j++ ){
                if(i%j==0){
                    r++;
                }
            }
            if(r==0 && i>=2){
                System.out.println(i+" ");
            }
        }
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        //primeno(num);
        primeseries(num);
    }
}
