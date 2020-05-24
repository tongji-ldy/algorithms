package tencent;

import edu.princeton.cs.algs4.Count;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = sc.nextInt();
        List<Integer[]> input = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            Integer[] a = new Integer[2];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            input.add(a);
        }

        for (int i = 0; i < t; i++) {
            int result = 0;
            for (int j = input.get(i)[0]; j <= input.get(i)[1]; j++) {
                int count = 1;
                for (int m = 1; m * k <= j; m++) {
                    count += j - m * k + 1;
                }
                result += count;
            }
            System.out.println(result);
        }
    }
}
