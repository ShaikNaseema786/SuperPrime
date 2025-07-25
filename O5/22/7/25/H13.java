import java.util.*;
public class H13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String  to check palimdrome or not");
        String s=sc.next();
        String res="";
        String temp=s;
        char ch[]=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            res+=ch[i];
        }
        res.trim();
        if(res.equals(temp)){
            System.out.println("Is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
