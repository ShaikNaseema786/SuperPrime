public class M7 {
    public static String rep(String s){
        if(s.length()==0)
            return "";
        if(s.length()==1){
            return s;
        }
        if(s.charAt(0) == s.charAt(1)){
            return rep(s.substring(1));
        } else {
            return s.substring(0,1) + rep(s.substring(1));
        }
    }

    public static void main(String[] args){
        String s = "zxyjjxdj";
        System.out.println(rep(s));  // Should print: zxyjxdj
    }
}
