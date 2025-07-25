public class E3 {
    public static void main(String args[]){
        int s1=sum(new int[]{1,2,3,4,5});
        System.out.print(s1);
    }
    public static int sum(int a[]){
        int total=0;
        for(int i:a){
            total=total+i;
        }
        return total;
    }
}
