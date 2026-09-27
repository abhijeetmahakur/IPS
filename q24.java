// Q24. Write a Java program to print the following pattern:
// 12345
// 1234
// 123
// 12
// 1

public class q24 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
