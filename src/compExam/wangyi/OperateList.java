package compExam.wangyi;

import java.util.Scanner;

public class OperateList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];
        for (int i = 0; i < ((n + 1) / 2); i++) {
            b[i] = a[n - 1 - 2 * i];
        }
        for (int i = 0; i < n / 2; i++) {
            b[n - 1 - i] = a[n - 2 - 2 * i];
        }
        for (int i = 0; i < n; i++) {
            if (i == n - 1) System.out.print(b[i]);
            else System.out.print(b[i] + " ");
        }
    }
}
