import java.util.*;
public class Detect_loop_in_Linked_list1 {

	static Node head;
    
	static class Node {
		int data;
		Node next;
	}

	// Inserts a new Node at front of the list.
	public static void push(int new_data)
	{
		Node new_node = new Node();
        new_node.data = new_data;
		new_node.next = head;
		head = new_node;
	}

	// Returns true if there is a loop in linked list else returns false.
	static boolean detectLoop(Node head)
	{
		HashSet<Node> s = new HashSet<Node>();
		while (head != null) {
			// If we have already has this node in hashmap it means their is a cycle (Because you we encountering the node second time).
			if (s.contains(head))
				return true;

			s.add(head);
			head = head.next;
		}

		return false;
	}

	public static void main(String[] args)
	{
		push(20);
		push(4);
		push(15);
		push(10);

		// Create loop for testing 
		head.next.next.next.next = head;

		if (detectLoop(head))
			System.out.println("Loop is found");
		else
			System.out.println("No Loop is found");
	}
}