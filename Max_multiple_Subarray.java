import java.util.Scanner;

public class Max_multiple_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size iof the array :- ");
        int N = sc.nextInt();
        int a[] = new int[N];
        System.out.println("Enter the elements of the array :- ");
        for(int  i = 0; i < N ; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        int max_prod = Integer.MIN_VALUE, prod = 1; 
        for(int i = 0; i < N; i++){
            if(a[i] == 0){
                max_prod = max_prod > prod ? max_prod : prod;
                System.out.println(max_prod);
                prod = 1;
            }
            else{
                prod = prod * a[i];
            }
        }
        max_prod = max_prod > prod ? max_prod : prod;
        System.out.println("Maximum product of subarray :- " + max_prod);
    }
}
