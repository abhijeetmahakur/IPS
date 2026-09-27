//find the sum of even numbers up ton when n is as naturals number
import java.util.Scanner;

public class q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 2; i <= n; i = i + 2) {
            sum = sum + i;
        }

        System.out.println("Sum of even numbers = " + sum);

        sc.close();
    }
}