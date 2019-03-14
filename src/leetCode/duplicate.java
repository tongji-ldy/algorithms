package leetCode;

import java.util.HashSet;

public class duplicate {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < length; i++) {
            if (!hs.add(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        duplicate d = new duplicate();
        int[] numbers = {2, 3, 1, 0, 4, 5, 3};
        int[] duplication = {-1};
        d.duplicate(numbers, numbers.length, duplication);
        System.out.println(duplication[0]);
    }
}
