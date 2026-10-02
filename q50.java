/*
Question: THE GLITCHED ELEVATOR

Given n and x, calculate the number of elevator trips/steps required.
If n is exactly divisible by x:
    s = n / x
Otherwise:
    s = n / x + 1
*/

import java.util.Scanner;

public class q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter x: ");
        int x = sc.nextInt();

        int s;

        if (n % x == 0)
            s = n / x;
        else
            s = n / x + 1;

        System.out.println(s);

        sc.close();
    }
}