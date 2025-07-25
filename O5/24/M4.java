public class M4 {
    public static void main(String[] args){
        int n=101011010;
        int c=0;
        while(n!=0){
            int rem=n%10;
            if(rem==0){
                c++;
            }
            n/=10;
        }
        System.out.println("The  number of zeros "+c);
    }
}
