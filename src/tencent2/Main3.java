package tencent2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[][] dp = new Integer[N][2];
        for (int i = 0; i < N; i++) {
            dp[i][0] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            dp[i][1] = sc.nextInt();
        }

        int dsum1 = 0;
        int psum1 = 0;
        for (int i = 0; i < N; i++) {
            if (dp[i][0] > dsum1) {
                dsum1 += dp[i][0];
                psum1 += dp[i][1];
            }
        }

        Arrays.sort(dp, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });

        int dsum2 = 0;
        int psum2 = 0;
        for (int i = 0; i < N; i++) {
            if (dp[i][0] > dsum2) {
                dsum2 += dp[i][0];
                psum2 += dp[i][1];
            }
        }
        System.out.println(Math.min(psum1, psum2));
    }
}
