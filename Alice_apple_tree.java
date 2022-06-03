import java.util.Scanner;

public class Alice_apple_tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of trees in North :- ");
        int n = sc.nextInt();
        System.out.print("Enter the number of trees in South :- ");
        int s = sc.nextInt();
        System.out.print("Enter the number of trees in East :- ");
        int e = sc.nextInt();
        System.out.print("Enter the number of trees in West :- ");
        int w = sc.nextInt();
        System.out.print("Enter the number of apples required :- ");
        int m = sc.nextInt();
        System.out.print("Enter the number of apples on each trees :- ");
        int k = sc.nextInt();
        sc.close();

        int total = (n * 0) + (s * k);
        if(e > 0){
            total += e;
        }
        if(w > 0){
            total += w;
        }
        if (total >= m){
            System.out.println("Apples requirement are filled " + m);
        }
        else{
            System.out.println("Apple requiement is not filled and number of required apples are " + (m - total));
        }
    }
}
