//Write a Java program to count how many numbers from 1 to n are divisible by k.
import java.util.Scanner;

public class q9
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = n / k;

        System.out.println(count);
    }
}