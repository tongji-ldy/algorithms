package compExam.wangyi;


import java.util.Arrays;
import java.util.Scanner;

public class AritPorg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int d = x[1] - x[0];
        for (int i = 0; i < n - 1; i++) {
            if (x[i + 1] - x[i] != d) {
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
    }
}
