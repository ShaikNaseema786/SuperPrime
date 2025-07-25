public class N4 {
    private int top;
    private int[] arr;
    private int size;

    N4(int size) {
        this.size = size;
        top = -1;
        arr = new int[size]; // initialize the array
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("The stack is overflow");
        } else {
            arr[++top] = data;
            System.out.println("The pushed element is " + data);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("The stack is empty");
        } else {
            System.out.println("The popped element is " + arr[top--]);
        }
    }

    public static void main(String[] args) {
        N4 n = new N4(4);
        n.push(1);
        n.push(2);
        n.push(3);
        n.push(4);
        n.push(5); // should trigger overflow

        n.pop();
        n.pop();
        n.pop();
        n.pop();
        n.pop(); // should trigger underflow
    }
}
