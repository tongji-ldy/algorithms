package leetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class maxInWindows {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> result = new ArrayList<>();
        if (num == null || size < 1 || size > num.length) return result;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < size; i++) {
            maxHeap.add(num[i]);
        }
        for (int i = size - 1; i < num.length; i++) {
            maxHeap.add(num[i]);
            result.add(maxHeap.peek());
            maxHeap.remove(num[i - size + 1]);
        }
        return result;
    }

    public static void main(String[] args) {
        maxInWindows miw = new maxInWindows();
        int[] num = {16, 14, 12, 10, 8, 6, 4};
        ArrayList<Integer> result = miw.maxInWindows(num, 5);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
