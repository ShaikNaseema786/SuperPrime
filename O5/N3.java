public class N3 {
    //public class BankQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor
    public N3(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        size = 0;
        rear = capacity - 1; // rear starts at end for circular logic
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Add customer to queue (enqueue)
    public void enqueue(int customerId) {
        if (isFull()) {
            System.out.println("Bank queue is full. Customer " + customerId + " please wait.");
            return;
        }
        rear = (rear + 1) % capacity;  // Circular increment
        queue[rear] = customerId;
        size++;
        System.out.println("Customer " + customerId + " entered the queue.");
    }

    // Serve customer (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("No customers to serve.");
            return -1;
        }
        int servedCustomer = queue[front];
        front = (front + 1) % capacity;  // Circular increment
        size--;
        System.out.println("Customer " + servedCustomer + " served and left the queue.");
        return servedCustomer;
    }

    // Display queue customers
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Current queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main method to simulate
    public static void main(String[] args) {
        N3 bankQueue = new N3(5); // Bank capacity is 5

        // Customers arrive
        bankQueue.enqueue(101);
        bankQueue.enqueue(102);
        bankQueue.enqueue(103);
        bankQueue.enqueue(104);
        bankQueue.enqueue(105);

        bankQueue.displayQueue();

        // Bank serves customers
        bankQueue.dequeue();
        bankQueue.dequeue();

        bankQueue.displayQueue();

        // More customers arrive
        bankQueue.enqueue(106);
        bankQueue.enqueue(107);

        bankQueue.displayQueue();

        // Try to add when full
        bankQueue.enqueue(108);

        // Serve remaining customers
        while (!bankQueue.isEmpty()) {
            bankQueue.dequeue();
        }

        bankQueue.displayQueue();
    }
}

