import java.util.*;
public class H7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter a string to substring or not");
        String c=sc.nextLine();
        System.out.println("Enter a sub-string: ");
        String sub=sc.next();
        System.out.println("Is it String contain sub-string: "+ c.contains(sub));
        sc.close();

    }
}
