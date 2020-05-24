package ebay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();
        List<Integer> weights = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp >= W) {
                result++;
            } else {
                weights.add(temp);
            }
        }

        Collections.sort(weights);
        for (int i = weights.size() - 1; i > 0; i--) {
            if (weights.size() == 0 || weights.size() == 1) break;
            for (int j = i - 1; j >= 0; j--) {
                if (weights.get(i) + weights.get(j) < W) {
                    result++;
                    weights.remove(i);
                    weights.remove(j);
                    break;
                }
            }
        }
        System.out.println(result + weights.size());

    }
}
