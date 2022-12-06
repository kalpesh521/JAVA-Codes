//Multidimensional arrays

public class Array2D {

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 3, 4, 5 }, { 7, 4, 5 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Jagged Array : Array which contain different number of columns

        int arr1[][] = new int[3][];
        arr1[0] = new int[3];
        arr1[1] = new int[4];
        arr1[2] = new int[2];

        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = count++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
