import java.util.Scanner;

public class Max_sum_hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of the array :- ");
        int N = sc.nextInt();
        System.out.print("Enter the number of column of the array :- ");
        int M = sc.nextInt();
        int a[][] = new int[N][M];
        
        System.out.println("Enter the elements of the array :- ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("\nArray :- ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println();

        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < M - 2; j++) {
                sum = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2];
                max_sum = Math.max(max_sum, sum);
            }
        }
        System.out.println("Maximum sum of Hour glass :- " + max_sum);
    }
}
