// Q19. Write a Java program to check whether a number contains 0 or not.

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean containsZero = false;

        while (n > 0) {
            int digit = n % 10;

            if (digit == 0) {
                containsZero = true;
                break;
            }

            n = n / 10;
        }

        if (containsZero) {
            System.out.println("Number contains 0");
        } else {
            System.out.println("Number does not contain 0");
        }
    }
}