package swea_java;

import java.util.Scanner;

public class SWEA2070 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            if (number1 > number2) {
                System.out.print("#" + i + " >");
            } else if (number1 < number2) {
                System.out.print("#" + i + " <");
            } else {
                System.out.print("#" + i + " =");
            }
        }
    }
}
