import java.util.Scanner;

public class Eulers_phi{
    public static int GCD(int a, int b){
        int gcd = 0;
        for(int i = 1; i <= a && i <= b; i++){
            if(a%i == 0 && b%i == 0){
            gcd = i;
            }
        }
        return gcd;
    }
    // static int GCD(int a, int b)
    // {
    //     if (a == 0)
    //         return b;
    //     return GCD(b % a, a);
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 1; i < n ; i++){
            if (GCD(i,n) == 1){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}