import java.util.Scanner;
public class Confused_pappu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '6') {
                str += '9';
            } else {
                str += s.charAt(i);
            }
        }

        int val = Integer.valueOf(s);
        int val1 = Integer.valueOf(str);

        int diff = val1 - val;
        System.out.println(diff);
    }
}