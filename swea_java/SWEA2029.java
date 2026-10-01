package swea_java;

import java.util.Scanner;

public class SWEA2029 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            System.out.print("#" + i + " ");
            System.out.print(number1 / number2 + " ");
            System.out.println(number1 % number2);
        }
    }
}
