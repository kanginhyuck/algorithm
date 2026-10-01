package swea_java;

import java.util.Scanner;

public class SWEA2025 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int result = 0;
        for (int i = 1; i <= number; i++) {
            result = result + i;
        }
        System.out.println(result);
    }
}
