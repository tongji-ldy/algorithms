package compExam.zhaoshang;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] li = new int[n];
        for (int i = 0; i < n; i++) {
            li[i] = scanner.nextInt();
        }
        int[] di = new int[n];
        for (int i = 0; i < n; i++) {
            di[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (li[j] > li[index]) {
                    index = j;
                }
            }
            if (index != i) {
                int temp = li[i];
                li[i] = li[index];
                li[index] = temp;
                temp = di[i];
                di[i] = di[index];
                di[index] = temp;
            }
        }

        int result = getMin(li, di, 0, n);
        System.out.println(result);
    }

    public static int getMin(int[] li, int[] di, int start, int n) {

        int maxNum = 1;
        int count = di[start];
        for (int i = start + 1; i < n; i++) {
            if (li[i] == li[start]) {
                maxNum++;
                count += di[i];
            } else {
                break;
            }
        }

        if (maxNum * 2 > n - start) {
            return 0;
        } else {
            int a = getMin(li, di, start + maxNum, n) + count;
            int b = getCount(li, di, start + maxNum, maxNum, n);
            return a < b ? a : b;
        }
    }

    private static int getCount(int[] li, int[] di, int start, int maxNum, int n) {
        int num = n - start - maxNum;
        if (num < 0) {
            return 0;
        } else {
            int[] arr = new int[n - start];
            int length = arr.length;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = di[start + i];
            }
            int count = 0;
            int x = 0;
            while (num >= 0) {
                int index = x;
                for (int i = x; i < length; i++) {
                    if (arr[i] < arr[index]) {
                        index = i;
                    }
                }
                int temp = arr[index];
                arr[index] = arr[x];
                arr[x] = temp;
                count += arr[x];
                x++;
                num--;
            }
            return count;
        }
    }
}
