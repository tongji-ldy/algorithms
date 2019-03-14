package leetCode;

public class LeftRotateString {
//    public String LeftRotateString(String str, int n) {
//        if (str.length() == 0) return str;
//        StringBuilder result = new StringBuilder();
//        char[] chars = str.toCharArray();
//
//        if (n > str.length()) n = n % str.length();
//
//        for (int i = n; i < chars.length; i++) {
//            result.append(chars[i]);
//        }
//        for (int j = 0; j < n; j++) {
//            result.append(chars[j]);
//        }
//        return result.toString();
//    }

    //原理：YX = (XTY T)T
    public String LeftRotateString(String str, int n) {
        if (str.length() == 0) return str;
        int len = str.length();
        char[] chars = str.toCharArray();
        if (n > str.length()) n = n % str.length();
        for (int i = 0, j = n - 1; i < j; i++, j--) swap(chars, i, j);
        for (int i = n, j = len - 1; i < j; i++, j--) swap(chars, i, j);
        for (int i = 0, j = len - 1; i < j; i++, j--) swap(chars, i, j);
        return String.valueOf(chars);
    }

    public void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;

    }

    public static void main(String[] args) {
        LeftRotateString lrs = new LeftRotateString();
        System.out.println(lrs.LeftRotateString("abcdefg", 3));
    }
}
