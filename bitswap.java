import java.util.Scanner;

public class bitswap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String b = Integer.toBinaryString(n);
        
        if(b.length() < 8){
            int len = b.length();
            while(len < 8){
                b = '0' + b;
                len++;
            }
        }
        System.out.println(b);
        String b1 = b.substring(b.length() - 8, b.length());
        String s1 = b1.substring(b.length() - 8, b1.length() - 4);
        String s2 = b1.substring(b1.length() - 4, b1.length());
        String s = s2 + s1;
        System.out.println(s);
        int val = Integer.parseInt(s, 2);
        System.out.println(val);
    }
}
