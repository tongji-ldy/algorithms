package leetCode;

import java.util.ArrayList;

public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        int add = 0;
        int start = 1;
        int end = 0;
        ArrayList<Integer> result;
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();

        if (sum == 1) return results;

        for (int i = start; add <= sum; i++) {
            add = add + i;
            if (add == sum) {
                end = i;
                result = new ArrayList<>();
                for (int j = start; j <= end; j++) {
                    result.add(j);
                }
                results.add(result);
            }
            if (add > sum) {
                start++;
                add = 0;
                i = start - 1;
            }
            if (start > sum / 2 + 1) break;
        }

        return results;
    }

    public static void main(String[] args) {
        FindContinuousSequence fcs = new FindContinuousSequence();
        ArrayList<ArrayList<Integer>> results = fcs.FindContinuousSequence(50);
        for (ArrayList<Integer> result : results) {
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
