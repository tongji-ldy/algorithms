package leetCode;

import java.util.ArrayList;

public class FindNumbersWithSum {
//    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
//        ArrayList<Integer> result = new ArrayList<>();
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] + array[j] == sum && array[i] * array[j] < min) {
//                    if (min == Integer.MAX_VALUE) {
//                        result.add(array[i]);
//                        result.add(array[j]);
//                    } else {
//                        result.set(0, array[i]);
//                        result.set(1, array[j]);
//                    }
//                    min = array[i] * array[j];
//                }
//            }
//        }
//        return result;
//    }

    //a+b=sum,a和b越远乘积越小，而一头一尾两个指针往内靠近的方法找到的就是乘积最小的情况。
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        int lo = 0, hi = array.length - 1;
        ArrayList<Integer> result = new ArrayList<>();

        while (lo < hi) {
            if (array[lo] + array[hi] == sum) {
                result.add(array[lo]);
                result.add(array[hi]);
                break;
            } else if (array[lo] + array[hi] > sum) {
                hi--;
            } else {
                lo++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindNumbersWithSum fnws = new FindNumbersWithSum();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> result = fnws.FindNumbersWithSum(array, 11);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
