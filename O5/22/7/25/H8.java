import java.util.*;
public class H8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter a string ");
        String c=sc.nextLine();
         
        c.trim();
        //int l=c.length();
        String sp[]=c.split(" ");
        
        System.out.println("The length of  last word String is "+ sp[sp.length-1]+" the length is"+sp[sp.length-1]);
        sc.close();

    }
}
