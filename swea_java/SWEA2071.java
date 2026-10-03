package swea_java;

import java.util.Scanner;

public class SWEA2071 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int i = 1; i <= T; i++) {

            int sum = 0;
            int[] numbers = new int[10];
            for (int j = 0; j < 10; j++) {
                numbers[j] = scanner.nextInt();
                sum += numbers[j];
            }
            System.out.println("#" + i + " " + Math.round((double)sum / 10));
        } //Math.round(double) 소수 첫째자리 반올림 몰랐음.
    }
}
