import java.util.*;
public class Divisible_3_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = 0;
        sc.close();
        for(int i = a; i <= b; i++){ 
            if (i % 15 == 0){
                s+=i;
            }
        }
        System.out.println(s);
    }
}

// import java.util.*;
// public class Divisible_3_5 {
//     static boolean divisible(int n)
//     {
//         if(n%15==0)
//             return true;
//         return false;
//     }
//     public static void main(String[] ar)
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number");
//         int m =sc.nextInt();
//         int n =sc.nextInt();
//         sc.close();
//         int s=0;
//         while(!divisible(m)){
//             m++;
//         }
//         for(int i=m;i<=n;i+=15){
//             s=s+i;
//         }
//         System.out.println("Sum ="+s);
//     }
// }