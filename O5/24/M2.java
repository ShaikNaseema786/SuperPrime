public class M2 {
    public static int fibonacci(int n) {
        int fib;
        if (n > 2) {
            fib = fibonacci(n - 1) + fibonacci(n - 2);
        } else if (n == 2) {
            fib = 1;
        } else {
            fib = 0;
        }
        return fib;
    }

    public static void main(String[] args) {
        int n = 23;
        System.out.println("Fibonacci number " + n + " is: " + fibonacci(n));
    }
}
