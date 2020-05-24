package compExam.zhaoshang;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[][] ld = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            ld[i][0] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            ld[i][1] = sc.nextInt();
        }
        Arrays.sort(ld, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o2[0].compareTo(o1[0]);
            }
        });

        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = (n / 2) + 1;
            if (ld[i][0] != ld[i + num - 1][0]) {
                n--;
                result += ld[i][1];
            } else break;
        }
        System.out.println(result);
    }
}
