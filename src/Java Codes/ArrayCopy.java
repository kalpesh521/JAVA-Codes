import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 8 }, { 3, 4, 4 }, { 1, 2, 3 } };
        int b[][] = { { 1, 2, 4 }, { 3, 2, 4 }, { 1, 2, 3 } };
        System.out.println("Addition of matrices is : ");
        int c[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMUltiplication of matrices is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][j] * b[i][j];

                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
