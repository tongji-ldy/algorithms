package test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * ��Ŀ��ʹ�ù���������Թ����Թ���0����㣬1�ǿ���·����2���յ㣬3�ǲ�����·������ӡ�����·����
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

        //���ö����������������Թ�������������·�����б�ǣ������ø�������edgeTo��¼�ýڵ����һ����㡣
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

        //����edgeTo�����д洢����һ�������Ϣ����׷�ݣ�push��ջ�У�����ջ��pop��ӡ����ʼ�㵽�յ��·����
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
