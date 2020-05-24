package compExam.zijietiaodong;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            if (n == 1) {
                result[i] = 1;
                continue;
            }
            for (int j = 0; j < n; j++) {
                al.add(sc.nextInt());
                result[i] += al.get(j);
                if (j > 0 && al.get(j) == al.get(j - 1)) result[i]--;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(result[i]);
        }
    }
}
