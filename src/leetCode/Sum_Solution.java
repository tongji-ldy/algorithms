package leetCode;

public class Sum_Solution {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }

    public static void main(String[] args) {
        Sum_Solution ss = new Sum_Solution();
        System.out.println(ss.Sum_Solution(100));
    }
}
