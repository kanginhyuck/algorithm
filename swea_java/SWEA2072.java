package swea_java;

import java.util.Scanner;

public class SWEA2072 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int i = 1; i <= T; i++) {

            int[] numbers = new int[10];
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                numbers[j] = scanner.nextInt();
                if (numbers[j] % 2 != 0) {
                    sum += numbers[j];
                }
            }
            System.out.println("#" + i + " " + sum);
        }
    }
}
