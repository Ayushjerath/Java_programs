import java.util.Arrays;
import java.util.Scanner;

public class Quicksort {
    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = h - 1;
        for (int j = h; j >= l; j--) {
            if (arr[j] > pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i--;
            }
        }
        int temp = arr[h];
        arr[h] = arr[i + 1];
        arr[i + 1] = temp;
        return i + 1;
    }

    public static void quick(int[] arr, int l, int h) {
        if (l < h) {
            int c = partition(arr, l, h);
            quick(arr, l, c - 1);
            quick(arr, c + 1, h);
        }
    }

    public static void main(String[] args) {

        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        quick(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}