import java.util.Scanner;

public class Manachars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String str = sc.next();
        int flag = 0;
        sc.close();
        int len = str.length() / 2, j = len;
        int k = (str.length() % 2 == 0) ? 0 : 1;
        for (int i = len; i > 0; i--) {
            if ((str.charAt(i - 1) != str.charAt(j + k))) {
                flag = 1;
                break;
            }
            j++;
        }
        if (flag == 0) {
            System.out.println("String is palindrome");
        } else if (flag == 1) {
            System.out.println("String is not palindrome");
        }
    }
}
