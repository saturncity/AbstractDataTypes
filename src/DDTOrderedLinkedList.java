public class DDTOrderedLinkedList {
    private Node head;

    public static void main(String[] args) {
        DDTOrderedLinkedList orderedList = new DDTOrderedLinkedList();

        orderedList.insert(50);
        orderedList.insert(30);
        orderedList.insert(5);
        orderedList.insert(30);
        orderedList.insert(10);

        orderedList.displayList();
    }

    public DDTOrderedLinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}