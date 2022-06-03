import java.util.Scanner;
class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b_year = sc.nextInt();
        int c_year = sc.nextInt();
        sc.close();
        int age = 0;
        if(b_year < c_year){
            age = c_year - b_year;
        }
        else if (b_year > c_year){
            age = 100 + c_year - b_year;
        }
        System.out.println(age);
    }
}