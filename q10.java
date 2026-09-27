//Write a Java program to find the sum of all the digits of n, where n is a whole number.
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        System.out.println(sum);
    }
}