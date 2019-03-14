package leetCode;

public class GetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) return 0;

        int[] result = new int[index];
        int i2 = 0, i3 = 0, i5 = 0;
        result[0] = 1;

        for (int i = 1; i < index; i++) {
            result[i] = Math.min(result[i2] * 2, Math.min(result[i3] * 3, result[i5] * 5));
            if (result[i] == result[i2] * 2) i2++;
            if (result[i] == result[i3] * 3) i3++;
            if (result[i] == result[i5] * 5) i5++;
        }

        return result[index - 1];
    }

    public static void main(String[] args) {
        GetUglyNumber_Solution gun = new GetUglyNumber_Solution();
        System.out.println(gun.GetUglyNumber_Solution(7));
    }
}
