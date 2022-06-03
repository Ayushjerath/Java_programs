import java.util.HashMap;
import java.util.Scanner;

public class Lexicography_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String str = sc.next();
        int N = str.length();
        sc.close();
        
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] a = str.toCharArray();
        for (int i = 0; i < N; i++) {
            if (hm.containsKey(a[i])) {
                hm.put(a[i], hm.get(a[i]) + 1);
            } else {
                hm.put(a[i], 1);
            }
        }
        int even = 0, odd = 0;
        int flag = 0;
        if (N % 2 == 0) {
            for (int i = 0; i < N; i++) {
                if (hm.get(a[i]) % 2 != 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("It is a Palindromic string");
            } else if (flag == 1) {
                System.out.println("It is not a palindromic string");
            }
        } else {
            for (int i = 0; i < N; i++) {
                if (hm.get(a[i]) % 2 == 0) {
                    even++;
                }
                else{
                    odd++;
                }
            }
            if((even == N - 1) && (odd == 1)){
                System.out.println("It is a Palindromic string");
            }
            else{
                System.out.println("It is not a palindromic string");
            }
        }
    }
}