package huawei;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] c1 = s1.split(",");
        int[] m = new int[c1.length];
        for (int i = 0; i < c1.length; i++) {
            m[i] = Integer.parseInt(c1[i]);
        }

        String s2 = sc.nextLine();
        String[] c2 = s2.split(",");
        int[] n = new int[c2.length];
        for (int i = 0; i < c2.length; i++) {
            n[i] = Integer.parseInt(c2[i]);
        }

        int k = sc.nextInt();

        int result = 0;
        for (int i = 0; i < m.length; i++) {
            result = result + n[i] - m[i];
        }

        System.out.println(result + k);
    }
}
