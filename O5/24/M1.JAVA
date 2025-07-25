public class M1 {

    public static int factorial(int i) {
        if (i < 0) {
            System.out.println("Factorial is not possible for negative numbers.");
            return -1; // Indicates an error
        }

        if (i >= 100) {
            System.out.println("The factorial of such a large number may take a long time.");
            return -1; // Avoid heavy computation
        }

        if (i == 0 || i == 1) {
            return 1; // Base case
        }

        return i * factorial(i - 1); // Recursive call
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            int result = factorial(i);
            if (result != -1) {
                System.out.println("The factorial of " + i + "! -> " + result);
            }
        }
    }
}
