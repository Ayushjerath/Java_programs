import java.util.Scanner;

public class Maximum_equilibrium_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int N = sc.nextInt();
        int a[] = new int[N];
        int arr_sum = 0;
        int sum = 0;
        int m = Integer.MIN_VALUE;

        System.out.println(("Enter the elements of the array:-"));
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            arr_sum += a[i];
        }
        sc.close();

        for (int i = N - 1; i >= 0; i--) {
            sum += a[i];

            if (arr_sum - sum == sum) {
                m = Math.max(m, sum);
            }
            if (arr_sum - sum + a[i] == sum) {
                m = Math.max(m, sum);
            }
        }
        if (m == Integer.MIN_VALUE){
            System.out.println("There is no maximum equilibrium sum in the array");
        }
        else {
            System.out.println("Maximum Equilibrium sum = " + m);
        }

        // public static int findEquilibrium(int[] arr, int n) {
        // int res = Integer.MIN_VALUE;
        // for (int i = 0; i < n; i++) {
        // int prefix_sum = arr[i];
        // for (int j = 0; j < i; j++) {
        // prefix_sum += arr[j];
        // }
        // int suffix_sum = arr[i];
        // for (int j = n - 1; j > i; j--) {
        // suffix_sum += arr[j];
        // }
        // if (prefix_sum == suffix_sum) {
        // res = Math.max(res, prefix_sum);
        // }
        // }
        // return res;
        // }

        // public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter the size of the array :- ");
        // int n = in.nextInt();
        // int[] arr = new int[n];

        // System.out.println(("Enter the elements of the array:-"));
        // for (int i = 0; i < n; i++) {
        // arr[i] = in.nextInt();
        // }
        // in.close();
        // System.out.println(findEquilibrium(arr, n));
    }
}