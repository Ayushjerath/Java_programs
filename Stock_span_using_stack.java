import java.util.Scanner;
import java.util.Stack;

public class  Stock_span_using_stack {
    public static void calculate_span(int price[], int n, int span[]){
        Stack<Integer> s = new Stack<>();   // Storing the number of days

        span[0] = 1;
        s.push(0);

        for(int i = 1; i < n; i++){
            while(!s.empty() && price[s.peek()] <= price[i]){
                s.pop();
            }
            if(s.empty()){
                span[i] = i + 1;
            }
            else{
                span[i] = i - s.peek();
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();
        int price[] = new int [n];
        int span[] = new int [n];
        System.out.println("Enter the elements of the array :- ");
        for(int i = 0; i < n; i++){
            price[i] = sc.nextInt();
        }
        sc.close();
        calculate_span(price, n, span);
        for(int i = 0; i < n; i++){
            System.out.println("Stock span of "+ price[i] + " is :- "+ span[i]);
        }
    }
}
