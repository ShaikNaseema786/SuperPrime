import java.util.*;
public class H11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter a string1");
        String c=sc.nextLine();
        //StringBuffer c1=new StringBuffer(c);
        char ar[]=c.toCharArray();
        Arrays.sort(ar);
        System.out.println("Enter a string2: ");
        String sub=sc.next();
         char br[]=sub.toCharArray();
        Arrays.sort(br);
        //System.out.println("Is it String contain sub-string: "+ c.contains(sub));
        if(Arrays.equals(ar,br))
            System.out.println("Is anagram");
        else
            System.out.println("is not anagram");
        sc.close();

    }
}
