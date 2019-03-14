package compExam.wangyi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PileChess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }

        ArrayList<ArrayList<Integer>> steps = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                al.add(Math.abs(x[j] - x[i]) + Math.abs(y[j] - y[i]));
            }
            Collections.sort(al);
            steps.add(al);
        }

        int minStep = Integer.MAX_VALUE;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                int step = 0;
                for (int j = 0; j < k + 1; j++) {
                    step += steps.get(i).get(j);
                }

                if (step < minStep) {
                    minStep = step;
                }
            }
            if (k == n - 1) System.out.print(minStep);
            else System.out.print(minStep + " ");
            minStep = Integer.MAX_VALUE;
        }
    }
}
