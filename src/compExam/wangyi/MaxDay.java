package compExam.wangyi;

import java.util.Scanner;

public class MaxDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int f = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();

        if (f * x > d) System.out.println(d / x);
        else System.out.println(f + (d - f * x) / (p + x));
    }
}
