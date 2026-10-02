package swea_java;

import java.util.Scanner;

public class SWEA2058 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int N = scanner.nextInt();
        int result = 0;

        if (N > 0 && N <= 9) {
            System.out.println(N);

        } else if (N > 9 && N <= 99) {
            N = (N / 10) + (N % 10);
            System.out.println(N);

        } else if (N > 99 && N <= 999) {
            N = (N / 100) + (N / 10 % 10) + (N % 100);
            System.out.println(N);

        } else if (N > 999 && N <= 9999) {
            N = (N / 1000) + (N / 100 % 10) + (N / 10 % 10) + (N % 10);
            System.out.println(N);

        } else {
            System.out.println();
        }
    }
}
