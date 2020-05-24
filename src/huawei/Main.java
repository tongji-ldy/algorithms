package huawei;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Integer> al = new ArrayList<>();
    private static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] a = s.toCharArray();

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] != ',') al.add(a[i] - '0');
        }

        int[] num = {2, 9, 5, 9, 5, 9};
        for (int i = 0; i < 6; i++) {
            while (!help(num[i]) && num[i] >= 0) {
                num[i]--;
            }
            if (num[i] < 0) {
                System.out.println("invalid");
                return;
            } else {
                result.add(num[i]);
                if (num[0] == 2) num[1] = 4;
            }
        }

        for (int i = 0; i < 6; i++) {
            if (i == 2 || i == 4) System.out.print(":");
            System.out.print(result.get(i));
        }
    }

    private static boolean help(int num) {
        if (al.contains(num)) {
            al.remove(al.indexOf(num));
            return true;
        }
        return false;
    }
}
