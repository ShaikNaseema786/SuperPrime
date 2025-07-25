public class N2 {
    // Inner Node class (no parentheses)
    private class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    private Node top;  // top of the stack
    private int oddCount = 0;
    private int evenCount = 0;

    // Constructor
    N2() {
        top = null;
    }

    // Push operation
    void push(int val) {
        Node ne = new Node(val);
        ne.next = top; // new node points to current top
        top = ne;      // update top to new node

        // Update counts on push
        if (val % 2 == 0)
            evenCount++;
        else
            oddCount++;

        System.out.println("Pushed: " + val);
    }

    // Pop operation
    void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        int val = top.data;
        top = top.next;

        // Update counts on pop
        if (val % 2 == 0)
            evenCount--;
        else
            oddCount--;

        System.out.println("Popped: " + val);
        System.out.println("Current odd count: " + oddCount);
        System.out.println("Current even count: " + evenCount);
    }

    public static void main(String[] args) {
        N2 stack = new N2();

        stack.push(1);
        stack.push(2);
        stack.push(4);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();  // popping when empty to show message
    }
}
