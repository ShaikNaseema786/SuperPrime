public class M5 {
    public static String numberToWord(int n){
        if(n==0){
            return "Zero";
        }
        if(n<10){
            return digit(n);
        }
        return numberToWord(n/10)+" "+digit(n%10);
    }
        public static void main(String[] args){
            int num1=203
    } 
}
