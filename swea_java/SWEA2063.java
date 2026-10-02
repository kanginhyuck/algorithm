package swea_java;

import java.util.Scanner;

public class SWEA2063 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {

                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(numbers[N / 2]);
    }
}
//다시 풀어야 함, 아직 배열을 어떻게 써야하는지 감이 안옴