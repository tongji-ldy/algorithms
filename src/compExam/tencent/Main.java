package compExam.tencent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        Integer[][] bank = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            bank[i][0] = sc.nextInt();
            bank[i][1] = sc.nextInt();
        }
        Arrays.sort(bank, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(bank[i][0] - bank[j][0]) >= d) maxHeap.add(bank[i][1] + bank[j][1]);
            }
        }
        System.out.println(maxHeap.peek());
    }
}
