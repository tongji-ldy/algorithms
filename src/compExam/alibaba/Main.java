package compExam.alibaba;

//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int x = 0;
//        int f = 0;
//        int d = 0;
//        int p = 0;
//        if (in.hasNextInt()) {
//            x = in.nextInt();
//            f = in.nextInt();
//            d = in.nextInt();
//            p = in.nextInt();
//        }
//        int day = 5;
//        while ((d >= (day - f) * p + x * day)) {
//            day++;
//        }
//        System.out.println(day - 1);
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] input = new int[4 * T];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }
        for (int i = 0; i < input.length - 3; i = i + 4) {
            int N = input[i];
            int A = input[i + 1];
            int B = input[i + 2];
            int C = input[i + 3];
            if ((A + 2 * B + 3 * C) / 6 >= N) {
                if (C % 2 != 0) {
                    if (((A + B * 2) > N * 6 - (C - 1) * 3) || (C % 2 != 0)) System.out.println("YES");
                    else System.out.println("NO");
                } else System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}