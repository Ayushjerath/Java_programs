public class Detect_loop_in_Linked_list2 {

    static class Node {
        int data;
        Node next;
        int flag;
    };

    static Node head;

    public static void push(int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.flag = 0;
        new_node.next = head;
        head = new_node;
    }

    // Returns true if there is a loop in linked list else returns false.
    static boolean detectLoop(Node h) {
        while (h != null) {

            // If this node is already traverse it means there is a cycle (Because you we encountering the node for the second time).
            if (h.flag == 1)
                return true;

            h.flag = 1;
            h = h.next;
        }
        return false;
    }

    public static void main(String[] args) {
        push(20);
        push(4);
        push(15);
        push(10);

        // Create a loop for testing
        head.next.next.next.next = head;

        if (detectLoop(head))
            System.out.println("Loop is found");
        else
            System.out.println("No Loop is found");
    }
}