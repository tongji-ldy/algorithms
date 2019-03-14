package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class isContinuous {
    public boolean isContinuous(int[] numbers) {
        if (numbers.length == 0) return false;
        int zeroCount = 0;
        int count = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < 4; i++) {
            if (numbers[i] == 0) zeroCount++;
            else break;
        }

        for (int i = zeroCount; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) return false;
            if (numbers[i] + 1 < numbers[i + 1]) count = count + numbers[i + 1] - numbers[i] - 1;
        }

        return count == 0 || count == zeroCount ? true : false;
    }

    public static void main(String[] args) {
        isContinuous ic = new isContinuous();
        int[] numbers = {0, 1, 2, 3, 4};
        System.out.println(ic.isContinuous(numbers));
    }
}
