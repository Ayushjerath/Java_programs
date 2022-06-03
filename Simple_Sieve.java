import java.util.Scanner;

public class Simple_Sieve {
    public static void sieve(int n){
        boolean ar[] = new boolean[n + 1];

        for (int i = 0; i <= n ; i++){
            ar[i] = true;
        }

        for (int p = 2; p*p <= n; p++){
            if(ar[p] == true){
                for(int i = p*p; i <= n; i += p){
                    ar[i] = false;
                }
            }
        }

        for(int i = 2; i <= n; i++){
            if(ar[i] == true){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = sc.nextInt();
        sc.close();
        sieve(n);
    }
}
