package compExam.pinduoduo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maze {
    public static class Node {
        int i;
        int j;
        int key;
        int step;

        public Node(int i, int j, int key, int step) {
            this.i = i;
            this.j = j;
            this.key = key;
            this.step = step;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();
        char[][] maze = new char[M][N];
        for (int i = 0; i < M; i++) {
            maze[i] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (maze[i][j] == '2') {
                    System.out.println(bfs(i, j, M, N, maze));
                }
            }
        }
    }

    private static int bfs(int i, int j, int M, int N, char[][] maze) {
        Queue<Node> queue = new LinkedList<>();
        int[][][] mp = new int[101][101][1025];
        int[][] next = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        queue.offer(new Node(i, j, 0, 0));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int k = 0; k < 4; k++) {
                int in = node.i + next[k][0];
                int jn = node.j + next[k][1];
                int key = node.key;
                if (in < 0 || jn < 0 || in >= M || jn >= N || maze[in][jn] == '0') continue;
                else if (maze[in][jn] == '3') return node.step + 1;
                else if (maze[in][jn] >= 'a' && maze[in][jn] <= 'z') key = key | (1 << (maze[in][jn] - 'a'));
                else if (maze[in][jn] >= 'A' && maze[in][jn] <= 'Z' && (key & (1 << (maze[in][jn] - 'A'))) == 0)
                    continue;
                if (mp[in][jn][key] == 0) {
                    mp[in][jn][key] = 1;
                    queue.offer(new Node(in, jn, key, node.step + 1));
                }
            }
        }
        return -1;
    }
}
