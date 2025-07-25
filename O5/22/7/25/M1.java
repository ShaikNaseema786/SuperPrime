import java.util.Scanner;

public class M1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many semesters?");
        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        String[] semesters = new String[n];
        double[] marks = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter semester name: ");
            semesters[i] = sc.nextLine();

            System.out.print("Enter marks for " + semesters[i] + ": ");
            marks[i] = sc.nextDouble();
            sc.nextLine();  // consume newline
        }

        System.out.println("\nSemester marks entered:");
        for (int i = 0; i < n; i++) {
            System.out.println(semesters[i] + ": " + marks[i]);
        }

        sc.close();
    }
}
