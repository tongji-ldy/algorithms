package leetCode;

public class NumberOf1Between1AndN_Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);
            char[] charArray = str.toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] == '1') count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOf1Between1AndN_Solution test = new NumberOf1Between1AndN_Solution();
        System.out.println(test.NumberOf1Between1AndN_Solution(1));
    }
}
