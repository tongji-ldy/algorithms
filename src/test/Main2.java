package test;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(binarySearch(a, key, 0, n - 1));
    }

    private static int binarySearch(int[] a, int key, int lo, int hi) {
        if (hi < lo) return -1;//注意此处是小于，不是小于等于
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return binarySearch(a, key, 0, mid - 1);
        else if (key > a[mid]) return binarySearch(a, key, mid + 1, hi);
        else return mid;
    }
}
