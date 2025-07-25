import java.util.*;
public class H6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter a string toreverse");
        String ss=sc.nextLine();
       StringBuilder s=new StringBuilder(ss);
        System.out.println("The reverse of  String is "+ s.reverse());
        sc.close();

    }
}
