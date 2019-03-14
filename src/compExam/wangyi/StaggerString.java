package compExam.wangyi;

import java.util.Scanner;

public class StaggerString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int maxLen = 1;
        int len = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                len++;
                if (len > maxLen) {
                    maxLen = len;
                }
            } else {
                len = 1;
            }
        }
        System.out.println(maxLen);
    }
}
