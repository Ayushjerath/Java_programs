import java.util.Scanner;

public class consecutive_ones {
    public static int count(String str){
        int len = str.length();
        int max_count = 0 ,count = 0;
        for(int i = 0; i < len; i++){
            if (str.charAt(i) == '1'){
                count++;
            }
            else{
                max_count = max_count > count? max_count : count;
                count = 0;
            }
        }
        max_count = max_count > count? max_count : count;
        System.out.println(max_count);
        return max_count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String str = sc.nextLine();
        sc.close();
        int b = 0, gr = 0;
        String new_str = "";
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '0'){
                new_str = str.substring(0, i) + '1' + str.substring(i+1, str.length());
                System.out.println(new_str);
                b = count(new_str);
                gr = gr > b? gr : b;
            }
        }
        System.out.println("The conseutive occurence of 1 by swapping one digit :- " + gr);
    }
}
