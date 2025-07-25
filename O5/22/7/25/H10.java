import java.util.*;
public class H10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int o=0;
        int max=0;
        System.out.println("Eneter a string ");
        String c=sc.nextLine();
        String sp[]=c.split(" ");
        for(int i=0;i<sp.length;i++){
            max=sp[i].length();
            o=Math.max(max, o);
        }
        System.out.println("The Longest word in a sentacne : "+ o);
        sc.close();

    }
}
