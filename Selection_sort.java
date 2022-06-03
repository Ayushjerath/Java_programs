import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int N = sc.nextInt();
        int a[] = new int[N];

        System.out.println("Enter the elements of the array:-");
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                if (a[i] > a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                    
                }
            }

        }
        for(int i = 0; i < N; i++){
            System.out.print(a[i] + " ");
        }
    }
}
