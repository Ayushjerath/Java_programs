import java.util.*;
public class Tower_of_hanoi {
    public static void pop_push(Stack<Integer> s, Stack<Integer> d){
        d.push(s.pop());
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> t = new Stack<>();
        Stack<Integer> d = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s + " , " + t + " , " + d);
        pop_push(s, d);
        pop_push(s, t);
        pop_push(d, t);
        pop_push(s, d);
        pop_push(t, s);
        pop_push(t, d);
        pop_push(s, d);
        System.out.println(s + " , " + t + " , " + d);
    }
}
