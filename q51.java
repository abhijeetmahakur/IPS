/*
Question:
Add the numbers:
(p + k), (p + 2k), (p + 3k), .......... (p + nk)

Find the sum of all the terms.
*/

import java.util.Scanner;

public class q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int k = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (p + i * k);
        }

        System.out.println(sum);

        sc.close();
    }
}