import java.util.Scanner;

public class M4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("ASCII values of each character:");
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            int ascii = (int) ch;
            System.out.println(ch + " : " + ascii);
        }

        sc.close();
    }
}
