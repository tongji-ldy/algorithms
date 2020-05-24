package test2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static class Node {
        char val;
        Node left;
        Node right;

        public Node(char val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node head = new Node('h');
        Node left = new Node('l');
        Node right = new Node('r');
        head.left = left;
        head.right = right;
        seri(head);
    }

    public static void seri(Node head) {
        ArrayList<Character> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(head);
        int count = 1;
        int nextcount = 0;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            result.add(node.val);
            if (node.val != '#') {
                if (node.left != null) queue.offer(node.left);
                else queue.offer(new Node('#'));
                if (node.right != null) queue.offer(node.right);
                else queue.offer(new Node('#'));
            }
            nextcount++;

            if (nextcount == count) {
                result.add(';');
                nextcount = 0;
                count = queue.size();
            }
        }

        for (char c : result) {
            System.out.print(c + " ");
        }
    }
}
