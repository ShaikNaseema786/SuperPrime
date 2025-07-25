import java.util.*;
public class H2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int c=0;
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter arr elemrnts");
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        }
        System.out.println("Entera element to count");
        int e=sc.nextInt();
        
        for(int i=0;i<n;i++){
            if(arr[i]==e){
                    c++;
            }
        }
        if(c>0){
            System.out.println("the element is print "+c+" times");
        }
        else{
            System.out.println("Element is not found");
        }
        sc.close();
    }
}
