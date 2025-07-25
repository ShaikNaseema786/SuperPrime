import java.util.*;
public class E3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to count");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter inhabitate count ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("to display");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();;
    }

}
