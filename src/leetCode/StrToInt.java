package leetCode;

public class StrToInt {
    public int StrToInt(String str) {
        char[] chars = str.trim().toCharArray();
        int symbol = 0;
        int start = 0;
        int sum = 0;

        if (chars.length == 0) return 0;

        if (chars[0] == '+') {
            start = 1;
        } else if (chars[0] == '-') {
            symbol = 1;
            start = 1;
        }
        for (int i = start; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') return 0;
            sum = sum * 10 + (int) (chars[i] - '0');
        }

        return (int) Math.pow(-1, symbol) * sum;
    }

    public static void main(String[] args) {
        StrToInt sti = new StrToInt();
        System.out.println(sti.StrToInt(""));
    }
}
