import java.util.Scanner;
public class Binary_Palindrome{
    public static String BinaryConverter(int n){
        int rem;
        String b = "";
        while(n > 0){
            rem = n % 2;
            b = rem + b;
            // b = b.concat(Integer.toString(rem));
            n = n/2;
        }
        System.out.println(b);
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // String b = Integer.toBinaryString(n);
        String b = BinaryConverter(n);
        boolean flag = true;
        for(int i = 0; i < b.length()/2; i++){
            if (b.charAt(i) != b.charAt(b.length() - i - 1)){
                flag = false;
                break;
            }
        }
        if (flag == true){
            System.out.println("It is Binary Palindrome");
        }
        else{
            System.out.println("It is not Binary Palindrome");
        }
    }
}