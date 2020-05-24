package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * 题目：使用广度优先走迷宫，迷宫中0是起点，1是可走路径，2是终点，3是不可走路径。打印出最短路径。
 */
public class Main1 {
    public static class Node {
        int i;
        int j;

        public Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int[][] maze = new int[m][n];
        int[] start = new int[2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
                if (maze[i][j] == 0) {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }
        bfs(start[0], start[1], m, n, maze);
    }

    private static void bfs(int i, int j, int m, int n, int[][] maze) {
        Queue<Node> queue = new LinkedList<>();
        boolean[][] mark = new boolean[m][n];
        Node[][] edgeTo = new Node[m][n];
        int[][] next = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        queue.offer(new Node(i, j));
        mark[i][j] = true;

        //利用队列上下左右搜索迷宫，对搜索过的路径进行标记，并利用辅助数组edgeTo记录该节点的上一个结点。
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int k = 0; k < 4; k++) {
                i = node.i + next[k][0];
                j = node.j + next[k][1];
                if (i >= m || j >= n || i < 0 || j < 0 || maze[i][j] == 3) continue;
                else if (maze[i][j] == 2) {
                    edgeTo[i][j] = node;
                    break;
                }
                if (!mark[i][j]) {
                    edgeTo[i][j] = node;
                    mark[i][j] = true;
                    queue.offer(new Node(i, j));
                }
            }
        }

        //根据edgeTo数组中存储的上一个结点信息进行追溯，push到栈中，最后从栈中pop打印从起始点到终点的路径。
        Stack<Node> stack = new Stack<>();
        if (maze[i][j] == 2) {
            stack.push(new Node(i, j));
            while (edgeTo[i][j] != null) {
                Node node = edgeTo[i][j];
                stack.push(node);
                i = node.i;
                j = node.j;
            }
            while (!stack.isEmpty()) {
                Node node = stack.pop();
                System.out.println("(" + node.i + "," + node.j + ")");
            }
        } else System.out.println("null");
    }
}
