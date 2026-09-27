// Q21. Write a Java program to print the following pattern:
// *****
// ****
// ***
// **
// *

public class q21 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}