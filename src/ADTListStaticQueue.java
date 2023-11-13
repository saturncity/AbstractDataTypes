public class ADTListStaticQueue {
    private ADTListStatic list;

    public static void main(String[] args) {
        ADTListStaticQueue queue = new ADTListStaticQueue();

        queue.insert(5);
        queue.insert(4);
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);

        System.out.println("First element is: " + queue.peek());
        System.out.println("Popping top element " + queue.remove());
        System.out.println("First element is now: " + queue.peek());
    }

    public ADTListStaticQueue() {
        list = new ADTListStatic();
    }

    public void insert(int item) {
        list.addTail(item);
    }

    public int remove() {
        int item = peek();
        list.remove(0);
        return item;
    }

    public int peek() {
        return list.peek(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
