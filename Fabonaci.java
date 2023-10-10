import java.util.Scanner;
public class Fabonaci {
    //print nth term
    public static int nthno(int n){
        if(n==1){
            return 0;
        }
        int n1=0,n2=1,n3=0;
        for(int i=1;i<=n;i++){
            //System.out.print(n1+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        return n1;
    }
    // print n terms
//    public static void fab(int n)
//    {
//        int n1=0,n2=1,n3=0;
//        for(int i=1;i<=n;i++){
//            System.out.print(n1+" ");
//            n3=n1+n2;
//            n1=n2;
//            n2=n3;
//        }
//
//    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        //fab(num);
        System.out.println(nthno(num));
    }
}

