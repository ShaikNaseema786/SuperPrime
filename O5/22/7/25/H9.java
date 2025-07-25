import java.util.*;
public class H9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int o=0;
        System.out.println("Eneter a string ");
        String c=sc.nextLine();
        String sp[]=c.split(" ");
        for(int i=0;i<sp.length;i++){
            if(Character.isUpperCase(sp[i].charAt(0))){
                o++;
            }
        }
        System.out.println("The no.of wordsStarts with capital Letter : "+ o);
        sc.close();

    }
}
