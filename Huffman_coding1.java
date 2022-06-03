import java.util.Scanner;

public class Huffman_coding1{
    public static String check(String b){
        while(b.length() < 8){
            b = '0' + b;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String ns = "";
        for(int i = 0; i < s.length(); i++ ){
            String b = Integer.toBinaryString(s.charAt(i));
            String bs = check(b);
            ns += bs;
        }
        // int n = Integer.parseInt(ns, 2);
        System.out.println(ns);
    }
}