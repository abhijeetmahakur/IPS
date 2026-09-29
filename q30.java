// Q30. Write a Java program to print:
// *********
//  *******
//   *****
//    ***
//     *

class Q30 {
    public static void main(String[] args) {

        int n = 7;

        for (int i = 9; i >= 1; i -= 2) {

            int spaces = (9 - i) / 2;

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
