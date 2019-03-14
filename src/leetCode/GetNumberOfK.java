package leetCode;

import java.util.Collections;

public class GetNumberOfK {
    public int GetNumberOfK(int[] array, int k) {
        int count = 0;
        int lo = 0;
        int hi = array.length - 1;
        int index = binarySearch(array, k, lo, hi);
        if (index == -1) return  0;
        int i = index, j = index;

        while (i <= array.length - 1 && array[i] == k) {
            count++;
            i++;
        }
        while (j >= 0 && array[j] == k) {
            count++;
            j--;
        }

        return count - 1;
    }

    public int binarySearch(int[] array, int k, int lo, int hi) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (array[mid] > k) hi = mid - 1;
            else if (array[mid] < k) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        GetNumberOfK gnok = new GetNumberOfK();
        int[] array = {3, 3, 3, 3, 4, 5};
        System.out.println(gnok.GetNumberOfK(array, 2));
    }
}
