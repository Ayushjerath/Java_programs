import java.util.*;

public class Sum_of_prime {
    static boolean pri(int n) {
        int c = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                c++;
                break;
            }
        }
        if (c == 0)
            return true;
        else
            return false;
    }

    public static void main(String A[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        sc.close();
        int s = 0;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                if (pri(i)) 
                    s = s + i;
            }
        }
        System.out.println("Sum = " + s);
    }

}