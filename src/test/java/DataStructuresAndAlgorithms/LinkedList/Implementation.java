package DataStructuresAndAlgorithms.LinkedList;

public class Implementation {
    static class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

    static class Node1 {
        private int data;
        private Node1 next;

        Node1(int data, Node1 next) {
            this.data = data;
            this.next = next;
        }
    }

    public void PrintList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "--->");
            curr = curr.next;
        }
    }

    public void ReverseList(Node1 head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + "--->");
        ReverseList(head.next);
    }


    public static void main(String args[]) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.setNext(temp1);
        temp1.setNext(temp2);
        Implementation implementation = new Implementation();
        System.out.println("Below is the loop traversal");
        implementation.PrintList(head);

        Node1 head1 = new Node1(1, new Node1(2, new Node1(3, null)));
        System.out.println();
        System.out.println("Below is the reversal traversal");
        implementation.ReverseList(head1);

    }
}
