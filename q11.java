//Write a Java program to find the reverse of a given number.
import java.util.Scanner;

public class q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        System.out.println(reverse);
    }
}
