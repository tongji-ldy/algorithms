package test;

import java.util.Scanner;

/**
 * 01背包问题
 */
public class bag01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];//每个物品的重量
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int[] v = new int[n];//每个物品的价值
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        int m = sc.nextInt();//背包最大容量
        int[][] f = new int[n + 1][m + 1];

        for (int i = 1; i < f.length; i++) {
            for (int j = 1; j < f[0].length; j++) {
                /*若当前物品重量小于背包容量，比较背包中放入该物品与不放入该物品的总价格*/
                if (w[i - 1] <= j) f[i][j] = Math.max(f[i - 1][j], f[i - 1][j - w[i-1]] + v[i-1]);//放入该物品，背包剩余容量的最大价值加上该物品价值
                else f[i][j] = f[i - 1][j];
            }
        }

        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[0].length; j++) {
                System.out.print(f[i][j] + " ");
            }
            System.out.println();
        }
    }
}
