public class ADTListStaticStack {
    public static void main(String[] args) {
        ADTListStaticStack stack = new ADTListStaticStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popping top element " + stack.pop());
        System.out.println("Top element is now: " + stack.peek());
    }

    private ADTListStatic list;

    public ADTListStaticStack() {
        list = new ADTListStatic();
    }

    public void push(int item) {
        list.addHead(item);
    }

    public int pop() {
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
