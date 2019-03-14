package leetCode;

import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.sort;
import static java.util.Arrays.binarySearch;

public class TwoSum {
    public int[] indices = new int[2];

    public int[] twoSum(int[] nums, int target) {
        sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= target) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] <= target) {
                        if (nums[i] + nums[j] == target) {
                            indices[0] = i;
                            indices[1] = j;
                            return indices;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(1,1);
        map.put(1,2);
        System.out.println(map.get(1));
        TwoSum ts = new TwoSum();
        int[] nums = {1, 2, 3, 6};
        int target = 8;
        int[] answer = ts.twoSum(nums, target);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }
}

