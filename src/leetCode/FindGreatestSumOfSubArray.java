package leetCode;

public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max = Integer.MIN_VALUE;
        int sum = -1;
        for (int i = 0; i < array.length; i++) {
            if (sum < 0 && array[i] > 0) {
                sum = 0;
            }
            if (sum >= 0) {
                sum = sum + array[i];
                max = Math.max(max, sum);
            } else {
                max = Math.max(max, array[i]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        FindGreatestSumOfSubArray test = new FindGreatestSumOfSubArray();
        int[] array = {1, -2, 3, 10, -4, 7, 2, -5};
        System.out.println(test.FindGreatestSumOfSubArray(array));
    }
}
