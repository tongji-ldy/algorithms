package tencent2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int index = sb.indexOf("01");
        while (index != -1) {
            sb.delete(index, index + 2);
            index = sb.indexOf("01");
        }
        index = sb.indexOf("10");
        while (index != -1) {
            sb.delete(index, index + 2);
            index = sb.indexOf("10");
        }
        System.out.println(sb.length());
    }
}
