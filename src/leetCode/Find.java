package leetCode;

import java.util.Arrays;

public class Find {
    public boolean find(int target, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (Arrays.binarySearch(array[i], target) >= 0) return true;
        }
        return false;
    }
}
