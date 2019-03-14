package chapter1;

public class Prefix {
    public static String a = "abcd";
    public static String b = "abce";
    public static String c = "abcdef";

    public static String comLen(String a, String b, String c) {
        if (a.length() < b.length()) {
            if (a.length() < c.length()) {
                return a;
            }
            return c;
        } else if (b.length() < c.length()) {
            return b;
        } else return c;
    }

    public static boolean comPrefix(String a, String b, String c) {
        if (b.startsWith(a)) {
            if (c.startsWith(a)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 0; !comPrefix(comLen(a,b,c), b, c); i++) {
            a = a.substring(0, a.length() - i);
        }
        System.out.println(a);
    }
}
