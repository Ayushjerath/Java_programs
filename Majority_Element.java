// import java.util.HashMap;
import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int N = sc.nextInt();
        int a[] = new int[N];
        int maxcount = Integer.MIN_VALUE;
        int ME = 0;
        System.out.println(("Enter the elements of the array:-"));
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (a[i] == a[j]) {
                    count += 1;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                ME = a[i];
            }
        }
        if (maxcount > N / 2) {
            System.out.println("Majority Element :- " + ME);
        } else {
            System.out.println("No Majority Element is found");
        }
    }

    // public static void main(String[] args) {
    // Scanner in = new Scanner(System.in);
    // System.out.print("Enter the size of array :- ");
    // int n = in.nextInt();
    // int[] arr = new int[n];

    // System.out.println(("Enter the elements of the array:-"));
    // for (int i = 0; i < n; i++) {
    // arr[i] = in.nextInt();
    // }
    // in.close();

    // HashMap<Integer, Integer> mp = new HashMap<>();
    // int ans = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (mp.containsKey(arr[i])) {
    // mp.put(arr[i], mp.get(arr[i]) + 1);
    // } else {
    // mp.put(arr[i], 1);
    // }
    // if (mp.get(arr[i]) > arr.length / 2) {
    // ans = arr[i];
    // break;
    // }
    // }
    // System.out.println(ans);
    // }
}
