import java.util.Scanner;

public class chinese_remainder_theorem {
    public static int CRT(int div[], int rem[], int size){
        int x = 1;
        while(true){
            int j;
            for(j = 0; j < size; j++){
                if(x % div[j] != rem[j]){   // Break loop if remainders are not matched
                    break;
                }
            }
            if (size == j){     // if all remainder are matched
                return x;
            }
            x++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of congruence relations :- "); 
        int n = sc.nextInt();
        int div[] = new int[n];
        int rem[] = new int[n];
        System.out.println("Enter the element of the divisor array :- "); 
        for(int i = 0; i < n; i++){
            div[i] = sc.nextInt();
        }
        System.out.println("Enter the element of the remainder array :- "); 
        for(int i = 0; i < n; i++){
            rem[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("The number is :- " + CRT(div, rem, n));
    }
}
