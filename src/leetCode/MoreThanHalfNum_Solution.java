package leetCode;

import java.util.ArrayList;
import java.util.HashSet;

public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int[] array) {
        HashSet<Integer> hs = new HashSet<>();
        int halfLen = array.length / 2;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            hs.add(array[i]);
        }
        if (hs.size() <= halfLen+1) {
            for (int i : hs) {
                for (int j = 0; j < array.length; j++) {
                    if (i == array[j]) count++;
                }
                if (count > halfLen) return i;
                else count = 0;
            }
        }
        return 0;
    }
}
