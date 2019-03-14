package compExam.pinduoduo;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ChildrensDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] w = new int[m];
        for (int i = 0; i < m; i++) {
            w[i] = sc.nextInt();
        }
        System.out.println(childrensDay(h, w));
    }

    public static int childrensDay(int[] h, int[] w) {
        PriorityQueue<Integer> maxHeaph = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < h.length; i++) {
            maxHeaph.add(h[i]);
        }
        PriorityQueue<Integer> maxHeapw = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < w.length; i++) {
            maxHeapw.add(w[i]);
        }

        int result = 0;
        while (!maxHeaph.isEmpty() && !maxHeapw.isEmpty()) {
            if (maxHeapw.peek() >= maxHeaph.peek()) {
                result++;
                maxHeaph.poll();
                maxHeapw.poll();
            } else {
                maxHeaph.poll();
            }
        }
        return result;
    }
}
