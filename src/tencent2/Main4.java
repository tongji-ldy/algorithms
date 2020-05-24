package tencent2;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int x = 0;
        Arrays.sort(a);
        for (int i = 0; i < k; i++) {
            if (i < n) {
                if (a[i] - x == 0) {
                    k++;
                    continue;
                }
                System.out.println(a[i] - x);
                x = a[i];
            } else System.out.println(0);
        }

    }
}

