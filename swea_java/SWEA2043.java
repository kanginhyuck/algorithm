package swea_java;

import java.util.Scanner;

public class SWEA2043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int P = scanner.nextInt();
        int K = scanner.nextInt();

        int count = (P - K) + 1;
        System.out.println(count);
    }
}
