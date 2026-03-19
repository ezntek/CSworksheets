
class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(3);
        Node n2 = new Node(4);
        Node n3 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = null;
    }
}
