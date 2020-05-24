package test;

import java.util.Scanner;

/**
 * 01��������
 */
public class bag01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];//ÿ����Ʒ������
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int[] v = new int[n];//ÿ����Ʒ�ļ�ֵ
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        int m = sc.nextInt();//�����������
        int[][] f = new int[n + 1][m + 1];

        for (int i = 1; i < f.length; i++) {
            for (int j = 1; j < f[0].length; j++) {
                /*����ǰ��Ʒ����С�ڱ����������Ƚϱ����з������Ʒ�벻�������Ʒ���ܼ۸�*/
                if (w[i - 1] <= j) f[i][j] = Math.max(f[i - 1][j], f[i - 1][j - w[i-1]] + v[i-1]);//�������Ʒ������ʣ������������ֵ���ϸ���Ʒ��ֵ
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
