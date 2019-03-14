package leetCode;

import java.util.ArrayList;

public class LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (n * m == 0) return -1;

        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        while (list.size() != 1) {
            index = ((index + m) > list.size() ? (index + m) % list.size() - 1 : index + m - 1);
            if (index == -1) index = list.size() - 1;
            System.out.println(index);
            list.remove(index);
        }

        return list.get(0);
    }

    public static void main(String[] args) {
        LastRemaining_Solution lrs = new LastRemaining_Solution();
        System.out.println(lrs.LastRemaining_Solution(6, 7));
    }
}
