import java.util.Scanner;

public class move_the_hyphen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String str = sc.next();
        sc.close();
        String ns1 = "", ns2 = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '-'){
                ns1 += str.charAt(i);
                System.out.println(ns1);
            }
            else{
                ns2 += str.charAt(i);
            }
        }
        String fstr = ns1.concat(ns2);
        System.out.println(fstr);
    }
}
