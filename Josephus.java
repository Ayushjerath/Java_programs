import java.util.ArrayList;
import java.util.Scanner;

public class Josephus {
    // public static int josephus(int n, int k) {
    //     if (n == 1){
    //         return 0;
    //         return 1;
    //     }
    //     int x = josephus(n - 1, k);
    //     int y = (x + (k)) % n;
    //     int y = (x + (k - 1)) % (n + 1);

    //     return y;
    //     }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.close();
            // System.out.println(josephus(n, k));
            ArrayList<Integer> a = new ArrayList<>(n);
            for(int i = 1; i <=n; i++){
                a.add(i);
            }
            k = k - 1;
            int st = 0;
            while(a.size() != 1){
                st = (st + k) % a.size();
                a.remove(st);
            }
            System.out.println(a.get(0));
        }
}
