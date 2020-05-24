package tencent2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        char[] c = s.toCharArray();

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= '0' && c[i] <= '9') al.add(c[i] - '0');
        }

        ArrayList<Integer> result = new ArrayList<>(al);
        for (int i = 0; i < al.size() / k; i++) {
            for (int j = 0; j < k; j++) {
                result.set(i * k + j, al.get(i * k + k - j - 1));
            }
        }

        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            if (i != result.size() - 1) System.out.print(result.get(i) + ",");
            else System.out.print(result.get(i) + "]");
        }
    }
}
