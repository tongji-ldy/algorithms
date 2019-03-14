package compExam.pinduoduo;

import java.util.Scanner;

public class MaxPlus {
    public static long maxPlus(int[] A) {
        if (A.length == 3) {
            return A[0] * A[1] * A[2];
        }

        long max1 = Integer.MIN_VALUE;
        long max2 = Integer.MIN_VALUE;
        long max3 = Integer.MIN_VALUE;
        long min1 = Integer.MAX_VALUE;
        long min2 = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = A[i];
            } else if (A[i] > max2) {
                max3 = max2;
                max2 = A[i];
            } else if (A[i] > max3) {
                max3 = A[i];
            }
            if (A[i] < min1) {
                min2 = min1;
                min1 = A[i];
            } else if (A[i] < min2) {
                min2 = A[i];
            }
        }

        System.out.println(max1 + " " + max2 + " " + max3 + " " + min1 + " " + min2);
        return Math.max(max1 * max2 * max3, max1 * min1 * min2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        MaxPlus mp = new MaxPlus();
        System.out.println(mp.maxPlus(A));
    }
}
