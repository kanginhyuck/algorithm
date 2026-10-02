package swea_java;

import java.util.Scanner;

public class SWEA2019 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = 1;

        for (int i = 0; i <= number; i++) {
            System.out.print(result + " ");
            result *= 2;
        }
    }
}