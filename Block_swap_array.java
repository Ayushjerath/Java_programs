 import java.util.Scanner;

public class Block_swap_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int N = sc.nextInt();
        int a[] = new int[N];
        int b[] = new int[N];
        System.out.println("Enter the elements of array :- ");
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the index around which elements to be swaped :- ");
        int B = sc.nextInt();
        sc.close();

        for (int i = 0; i < N - B; i++) {
            b[i] = a[B + i];
            if (i < B) {
                b[N - B + i] = a[i];
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\n");
    }
}