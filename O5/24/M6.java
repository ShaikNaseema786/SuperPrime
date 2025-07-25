public class M6 {
    public static String rec(String s) {
        // Base case: if the string is shorter than 2 chars, just return it
        if (s.length() < 2) {
            return s;
        }

        // If the first two characters are "pi", replace with "3.14" and recurse on rest
        if (s.startsWith("pi")) {
            return "3.14" + rec(s.substring(2));
        }

        // Otherwise, keep the first character and recurse on the remaining string
        return s.charAt(0) + rec(s.substring(1));
    }

    public static void main(String[] args) {
        String s = "pipipoi";
        System.out.println(rec(s));  // Output: 3.143.14poi
    }
}
