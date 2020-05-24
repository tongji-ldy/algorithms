package compExam.zijietiaodong;

import java.util.Scanner;

public class Main {
    private static int num = 0;
    private static int left = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        left = 1024 - N;
        change(64);
        change(16);
        change(4);
        change(1);
        System.out.println(num);
    }

    private static void change(int coin) {
        if (left > coin) {
            num += left / coin;
            left %= coin;
        }
    }
}
