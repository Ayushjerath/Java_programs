import java.util.Scanner;

public class maxequi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int N = sc.nextInt();
        int a[] = new int[N];
        int arr_sum = 0;

        System.out.println(("Enter the elements of the array:-"));
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            arr_sum += a[i];
        }
        sc.close();

        int i = 0, sas = 0;
        while(arr_sum/2 !=  sas && sas < arr_sum/2){
            sas = sas + a[i];
            i++;
        }
        if(sas == arr_sum/2){
            System.out.println("Maximum Equilibrium sum = " + sas);
        }
        else{
            System.out.println("There is no maximum equilibrium sum in the array");
        }
    }
}
