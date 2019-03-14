package compExam.kedaxunfei;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Quarrel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String queue = sc.next();
        int count = 0;
        count = queue.length() - (queue.lastIndexOf("L") - queue.indexOf("R"));
        System.out.println(count);
    }
}
