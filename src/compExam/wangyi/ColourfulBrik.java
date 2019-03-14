package compExam.wangyi;

import java.util.HashSet;
import java.util.Scanner;

public class ColourfulBrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        HashSet hs = new HashSet();
        for (int i = 0; i < c.length; i++) {
            hs.add(c[i]);
        }
        if (hs.size() == 1) System.out.println(1);
        else if (hs.size() == 2) System.out.println(2);
        else System.out.println(0);
    }
}
