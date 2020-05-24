package jingdong;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(0);
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 2 * (n - 1); i++) {
            int key = sc.nextInt();
            Integer value = map.get(key);
            int count = 1;
            if (value != null) {
                count = value + 1;
            }
            map.put(key, count);
        }

        int result = 0;
        if (map.get(1) != 2) result++;
        for (int i = 1; i < n; i++) {
            if (map.get(i + 1) != 3) result++;
        }
        System.out.println(result);
    }
}
