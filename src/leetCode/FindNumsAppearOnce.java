package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            Integer value = map.get(array[i]);
            int count = 1;
            if (value != null) {
                count = value + 1;
            }
            map.put(array[i], count);
        }

        for (Integer i : map.keySet()) {
            Integer value = map.get(i);
            if (value % 2 != 0) {
                result.add(i);
            }
        }

        num1[0] = result.get(0);
        num2[0] = result.get(1);
    }
}
