import java.util.Scanner;

public class Strobogrammatic_Number {
    public static void check(int n){
        int rem, sum =0, x = n;
        boolean flag = true;
        while(n != 0){
            rem = n% 10;
            if (rem == 6){
                rem = 9;
            }
            else if(rem == 9){
                rem = 6;
            }
            else if (rem == 2 || rem == 3 || rem == 4 || rem == 5 || rem == 7){
                 flag = false;
                 break;
            }

            sum = (sum * 10) + rem;
            n = n / 10; 
        }
        if (sum == x){
            System.out.println("It is a strobogrammatic Number");
        }
        else if (sum != x || flag == false){
            System.out.println("It is not a strobogrammatic Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        check(n);
    }
}
