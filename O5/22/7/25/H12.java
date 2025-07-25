import java.util.*;
public class H12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int v=0;
        int c=0;
        char ch[]=s.toCharArray();
        for(char i:ch){
            if (Character.isLetter(i)){
            if(i=='A'|| i=='E'||i=='I'||i=='O'||i=='U' || i=='a'|| i=='e'||i=='i'||i=='o'||i=='u'){
                v++;
            }
            else{
                c++;
            }
        }
        }
        System.out.println("The number of Vowels is "+v+" and the no of Consonates "+c);
        sc.close();
    }
}