package swea_java;

import java.util.Scanner;

public class SWEA2068 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {

            int max = 0;

            for (int j = 0; j < 10; j++) {
                int number = scanner.nextInt();

                if (number > max) {
                    max = number;
                }
            }
            System.out.println("#" + i + " " + max);
        }
    }
}