package leetCode;

import java.util.ArrayList;

public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<Integer> result = new ArrayList();
        int a = 0, b = row - 1;
        int c = 0, d = col - 1;
        int count = 1;
        int num = 0;
        int i = 0, j = 0;

        while (num != row * col) {
            if (count % 4 == 1) {
                for (int m = c; m <= d; m++) {
                    result.add(matrix[a][m]);
                    num++;
                }
                a++;
            }
            if (count % 4 == 2) {
                for (int m = a; m <= b; m++) {
                    result.add(matrix[m][d]);
                    num++;
                }
                d--;
            }
            if (count % 4 == 3) {
                for (int m = d; m >= c; m--) {
                    result.add(matrix[b][m]);
                    num++;
                }
                b--;
            }
            if (count % 4 == 0) {
                for (int m = b; m >= a; m--) {
                    result.add(matrix[m][c]);
                    num++;
                }
                c++;
            }
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int val = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][i] = val;
                val++;
            }
        }
        PrintMatrix pm = new PrintMatrix();
        for (int i = 0; i < 16; i++) {
            System.out.println(pm.printMatrix(matrix).get(i));
        }
    }
}
