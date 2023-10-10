import java.util.Scanner;

public class UniqueNumber {
    static boolean uniqueNum(int n){
        boolean[] seenDigits = new boolean[10]; // Create an array to track seen digits (0-9)

        while (n > 0) {
            int digit = n % 10; // Get the last digit of the number
            if (seenDigits[digit]) {
                return false; // If the digit has been seen before, return true
            }
            seenDigits[digit] = true; // Mark the digit as seen
            n /= 10; // Remove the last digit
        }

        return true; // If we reach here, no repeated digits were found
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(uniqueNum(num));
    }
}
