package chapter1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*读取输入*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 2];
        for (int i = 2; i < n + 2; i++) {
            a[i] = sc.nextInt();
        }

        /*计算*/
        int[][] f = new int[2][n + 2];
        for (int i = 2; i < n + 2; i++) {
            f[0][i] = Math.min(f[1][i - 1], f[0][i - 1]) + a[i];
            f[1][i] = Math.min(f[0][i - 1], f[0][i - 2]);
        }

        /*输出结果*/
        System.out.println(Math.min(f[0][n + 1], f[1][n + 1]));
    }
}
