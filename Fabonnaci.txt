import java.util.Scanner;
public class Fabonnaci {
    //print nth term  fabonnaci number
    public static int nthno(int n){//10

        if(n==1||n==2){

            return 1;
        }
        int n1 = 1, n2 = 1, n3=0;
//           System.out.print(n1 + " " + n2);
            for (int i = 1; i <= n - 2; i++) {// 1 1 2 3 5 8 13 21  34 55
                n3 = n1 + n2;//n3=1+1=2  //n3=3  n3=5
//                System.out.print(" " + n3);//2
                n1 = n2;//n1=1  2  3
                n2 = n3;//n2=2  3  5
            }
            return n3;

    }
//print n terms of fabonnaci series
   // public static void fabonnaci(int n){
//        if(n==1){
//            System.out.println(0);
//            return;
//        }
//            int n1 = 0, n2 = 1, n3;
//            System.out.print(n1 + " " + n2);
//            for (int i = 1; i <= n - 2; i++) {
//                n3 = n1 + n2;
//                System.out.print(" " + n3);
//                n1 = n2;
//                n2 = n3;
//            }
//}

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        //fabonnaci(num);
        System.out.println(nthno(num));

    }
}
