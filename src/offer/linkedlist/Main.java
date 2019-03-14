package offer.linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (N == 1) System.out.println(M);
        else System.out.println(fun(1, M, N, M));
    }

    private static int sum(int s, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += s;
            s = (s + 1) / 2;
        }
        return sum;
    }

    private static int fun(int lo, int hi, int n, int m) {
        if (hi < lo) return hi;
        int mid = lo + (hi - lo + 1) / 2;
        if (sum(mid, n) == m) return mid;
        else if (sum(mid, n) > m) return fun(lo, mid - 1, n, m);
        else return fun(mid + 1, hi, n, m);
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int K = sc.nextInt();
//        int A = sc.nextInt();
//        int X = sc.nextInt();
//        int B = sc.nextInt();
//        int Y = sc.nextInt();
//
//        if (X * A + Y * B == K) System.out.println(1);
//        if (X * A + Y * B < K) System.out.println(0);
//    }
}
