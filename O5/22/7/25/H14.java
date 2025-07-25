import java.util.*;
public class H14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String s=sc.nextLine();
        String res="";
        String sp[]=s.split(" ");
        for(int i=0;i<sp.length;i++){
            res+=sp[i];
            res.trim();
        }
        System.out.println(res);
        sc.close();
    }
}