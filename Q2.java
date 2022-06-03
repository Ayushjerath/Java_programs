import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();
        int st = sc.nextInt();
        int count = 0;
        sc.close();
        // int arr[] = { l1, l2, l3 };
        // Arrays.sort(arr);
        // count = 0;
        // if (st <= arr[0]) {
        //     count = 1;
        // } 
        // else if (st <= (arr[0] + arr[1])) {
        //     count = 2;
        // } 
        // else if (st <= (arr[0] + arr[1] + arr[2])) {
        //     count = 3;
        // } 
        // else {
        //     System.out.println("Can't accomodate in the three labs;");
        // }
        // System.out.println(count);

        if(st <= l1){
            count++;
        }
        if(st <= l2){
            count++;
        }
        if(st <= l3){
            count++;
        }
        System.out.println(count);
    }
}
