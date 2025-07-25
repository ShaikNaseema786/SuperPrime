public class M3 {
    public static int numberCountZero(int n){
        int zeroCount=0;
        if(n==0){
            zeroCount=1;
        }
        else if (n<10){
            zeroCount=0;
        }
        else if(n%10==0){
            zeroCount=numberCountZero(n/10)+1;
        }
        else{
            zeroCount=numberCountZero(n/10);
        }
        return zeroCount;
    }
    public static void main(String[] args){
        int n=1001010101;
        System.out.println(numberCountZero(n));
    }}
