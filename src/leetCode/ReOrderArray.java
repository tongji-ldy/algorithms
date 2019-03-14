package leetCode;

import java.util.ArrayList;

public class ReOrderArray {
    public void reOrderArray(int[] array) {
        int[] copy = new int[array.length];
        int index1 = 0;
        int index2 = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) copy[index1++] = array[i];
            else copy[index2--] = array[i];
        }

        for (int i = 0; i < index1; i++) {
            array[i] = copy[i];
        }
        for (int i = array.length - 1; i > index2; i--) {
            array[index1++] = copy[i];
        }
    }
}
