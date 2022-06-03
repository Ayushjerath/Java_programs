import java.util.Scanner;

public class Doubly_LinkedList {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    static Node head, tail;

    public static void firstnode(int data){
        Node newnode = new Node(data);
        head = tail = newnode;
        head.prev = null;
        tail.next = null;
    }

    public static int size(){
        int s = 0;
        Node temp = head;
        while(temp != null){
            s++;
            temp = temp.next;
        }
        return s;
    }
    
    public static void InsertAtBeg(int data){
        Node newnode = new Node(data);
        if(head == null){
            firstnode(data);
        }
        else{
            newnode.next = head;
            newnode.prev = null;
            head.prev = newnode;
            head = newnode;
        }
    }

    public static void InsertAtEnd(int data){
        Node newnode = new Node(data);
        if(head == null){
            firstnode(data);
        }
        else{
            tail.next = newnode;
            newnode.prev = tail;
            newnode.next = null;
            tail = newnode;
        }
    }

    public static void InsertAtPos(int data, int pos){
        Node newnode = new Node(data);
        if(head == null){
            firstnode(data);
        }
        else if(pos == 1){
            InsertAtBeg(data);
        }
        else if(pos == size() + 1){
            InsertAtEnd(data);
        }
        else{
            Node temp = head;
            int i = 1;
            while(i < (pos - 1)){
                temp = temp.next;
                i++;
            }
            newnode.prev = temp;
            newnode.next = temp.next;
            temp.next = newnode;
            newnode.next.prev = newnode;
        }
    }

    public static void DeleteFromBeg() {
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            if(head != tail){
                head = head.next;
                head.prev = null;
            }
            else{
                head = tail = null;
            }
        }
    }

    public static void DeleteFromEnd() {
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            if(head != tail){
                tail = tail.prev;
                tail.next = null;
            }
            else{
                head = tail = null;
            }
        }
    }

    public static void DeleteFromPos(int pos) {
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else if(pos == 1){
            DeleteFromBeg();
        }
        else if(pos == size()){
            DeleteFromEnd();
        }
        else{
            Node temp = head;
            int i = 1;
            while(i < pos){
                temp = temp.next;
                i++;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public static void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            System.out.print("Nodes of Doubly Linked List :- ");
            while(current != null){
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.close();
    }
}


    // public static void swap(Node A, Node B){
    //     B.prev = A.prev;
    //     A.next = B.next;
    //     B.next = A;
    //     A.prev = B;
    //     B.next.prev = A;
    // // }
    // public static void main(String[] args) {
    
        // Node temp = head;
        // Node temp1 = head.next;
        // Node temp3 = head;
        // while(temp != null){
        //     while(temp1 != null){
        //         if(temp.data > temp1.data){
                    // swap(temp, temp1);
        //             Node A = temp;
        //             Node B = temp1;
        //             B.prev = A.prev;
        //             A.next = B.next;
        //             B.next = A;
        //             A.prev = temp1;
        //             B.next.prev = A;
        //         }
        //         temp1 = temp1.next;
        //     }
        //     temp = temp.next;
        // }
        // while(temp3 != null){
        //     System.out.print(temp3.data + " ");
        //     temp3 = temp3.next;
        // }
    // }
