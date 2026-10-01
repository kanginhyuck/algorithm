package swea_java;

public class SWEA2027 {

    static void main() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print("#");
                } else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}
