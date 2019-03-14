package leetCode;

public class NumberOf1 {
    public int NumberOf1(int n) {
        int count = 0;
        String s = Integer.toBinaryString(n);
        char[] b = s.toCharArray();
        for (int i = 0; i < b.length; i++) {
            if (b[i] == '1') count++;
        }
        return count;
    }
}
