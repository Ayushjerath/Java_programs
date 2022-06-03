import java.util.Scanner;

public class Leaders_in_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :- ");
        int N = sc.nextInt();
        int a[] = new int[N];

        System.out.println("Enter the elements of the array:-");
        for(int i =0; i < N; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        int leader = a[N-1];
        
        System.out.println(leader);
        for (int i = N-2; i >= 0; i--){
            if (a[i] > leader){
                leader = a[i];
                System.out.println(leader);
            }
        }
    }
}