
public class Linear {
    public static void main(String[] args) {
        int[] num = { 2, 3, 4, 1, 7, 6, 11 };
        int target = 7;
        int ans = linearsearch(num, target);
        Boolean ans2 = linearsearch2(num, target);
        int ans3= linearsearch3(num, target);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    static Boolean linearsearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        return false;
    }       

    static int linearsearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        return Integer.MAX_VALUE;
    }       
}
