package swea_java;

import java.util.Scanner;

public class SWEA2056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int date = scanner.nextInt();

            int year = date / 10000;
            int day = date % 100;
            int month = (date % 10000) / 100;

            int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (month < 1 || month > 12) {
                System.out.println("#" + i + " -1");
            } else if (day < 1 || day > days[month - 1]) {
                System.out.println("#" + i + " -1");
            } else {
                System.out.println("#" + i + " " + year + "/" + month + "/" + day);
            }
        }
    }
}