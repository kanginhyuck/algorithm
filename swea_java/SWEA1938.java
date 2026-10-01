package swea_java;

import java.util.Scanner;

public class SWEA1938 {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println(sum);
        int difference = a - b;
        System.out.println(difference);
        int product = a * b;
        System.out.println(product);
        int quotient = a / b;
        System.out.println(quotient);
    }
}
