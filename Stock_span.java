import java.util.Scanner;

public class Stock_span {
    public static void main(String[] args) {
        // int price[] = {100, 60, 70, 65, 80, 85, 200};
        // int n = price.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();
        int price[] = new int [n];
        System.out.println("Enter the elements of the array :- ");
        for(int i = 0; i < n; i++){
            price[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("\nStock span of "+ price[0] + " is :- "+ 1);
        for(int i = 1; i < n; i++){
            int sum = 1;
            for(int j = i - 1; j >= 0; j--){
                if(price[i] <= price[j]){
                    break;
                }
                else if(price[i] > price[j]){
                    sum++;
                }
            }
            System.out.println("Stock span of "+ price[i] + " is :- "+ sum);
        }
    }
}
