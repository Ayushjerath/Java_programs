import java.util.Scanner;

public class Tower_of_hanoi_recursion {
    public static void toh(int n, char from_rod, char to_rod, char helper_rod) {
        if(n == 0){
            return;
        }
        toh(n - 1, from_rod, helper_rod, to_rod);
        System.out.println("Move disk " + n + " from rod "+ from_rod+ " to rod "+ to_rod);
        toh(n - 1, helper_rod, to_rod, from_rod);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks :- ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Here \'A\', \'B\', \'C\' rods are used. \n\'A\' is sourse rod, \'B\' is the helper rod, \'C\' is the destination rod.\n");
        toh(n, 'A', 'C', 'B');
    }
}
