//Count Numbers up to N Divisible by K
import java.util.Scanner;

public class q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                count++;
            }
        }

        System.out.println("Count = " + count);

        sc.close();
    }
}
