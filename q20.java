// Q20. Write a Java program to print the following pattern:
// *
// **
// ***
// ****
// *****

public class q20 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}