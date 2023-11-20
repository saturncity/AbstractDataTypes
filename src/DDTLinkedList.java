public class DDTLinkedList {
    private Node head;
    private Node tail;


    public static void main(String[] args) {
        DDTLinkedList myList = new DDTLinkedList();

        myList.addToHead(10);
        myList.addToHead(20);
        myList.addToHead(30);

        myList.addToTail(5);
        myList.addToTail(15);

        myList.displayList();
    }

    public DDTLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addToTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
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