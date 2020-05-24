package compExam.zijietiaodong;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        StringBuilder[] sb = new StringBuilder[N];
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            sb[i] = check1(new StringBuilder(s));
            sb[i] = check2(sb[i].append(" "));
        }
        for (int i = 0; i < N; i++) {
            System.out.println(sb[i].deleteCharAt(sb[i].length() - 1));
        }
    }

    private static StringBuilder check1(StringBuilder sb) {
        int pattern = 0;
        for (int start = 0, next = 1; next < sb.length(); next++) {
            if (sb.charAt(start) == sb.charAt(next)) {
                pattern++;
                if (pattern == 2) {
                    sb.deleteCharAt(next);
                    next--;
                    pattern--;
                }
            } else {
                pattern = 0;
                start++;
            }
        }
        return sb;
    }

    private static StringBuilder check2(StringBuilder sb) {
        int pattern = 0;
        for (int start = 0, next = 1; next < sb.length(); next++) {
            if (sb.charAt(start) == sb.charAt(next)) {
                pattern++;
                if (pattern == 3) {
                    sb.deleteCharAt(next);
                    next--;
                    pattern--;
                    continue;
                }
                next++;
                if (sb.charAt(next) != sb.charAt(start)) {
                    pattern++;
                    start = next;
                }
            } else {
                pattern = 0;
                start++;
            }
        }
        return sb;
    }
}
