import java.util.*;

public class N1 {
    private int size;
    private int top = -1;
    private int[] arr;
    private int oddCount = 0;
    private int evenCount = 0;

    // Constructor to initialize stack with given size
    public N1(int size) {
        this.size = size;
        arr = new int[size];
    }

    // Push element on stack
    void push(int ele) {
        if (top == size - 1) {
            System.out.println("Stack Overflow! Cannot push " + ele);
            return;
        }
        arr[++top] = ele;
        System.out.println("Pushed: " + ele);
    }

    // Pop one element from stack and update odd/even count
    void pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return;
        }
        int val = arr[top--]; // Remove top element

        // Update counts
        if (val % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }

        System.out.println("Popped: " + val);
        System.out.println("Odd count so far: " + oddCount);
        System.out.println("Even count so far: " + evenCount);
    }

    // Optional method to check if stack is empty
    boolean isEmpty() {
        return top < 0;
    }

    public static void main(String[] args) {
        N1 stack = new N1(10);

        // Push 0 to 9 onto stack
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        // Pop all elements one by one
        while (!stack.isEmpty()) {
            stack.pop();
        }
    }
}
