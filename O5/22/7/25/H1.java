import java.util.*;
public class H1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in arr");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a element to search:");
        int s=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==s){
                System.out.println("Element Found");
                flag=true;
                break;
            }
        }
        if(!flag)
            System.out.println("Not found Element");
        sc.close();

        }
       

    }

 
