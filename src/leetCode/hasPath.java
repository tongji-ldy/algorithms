package leetCode;

public class hasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] flag = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (search(matrix, rows, cols, i, j, 0, str, flag)) return true;
            }
        }
        return false;
    }

    private boolean search(char[] matrix, int rows, int cols, int i, int j, int index, char[] str, boolean[] flag) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[i * cols + j] != str[index] || flag[i * cols + j])
            return false;
        if (index == str.length - 1) return true;
        flag[i * cols + j] = true;
        if (search(matrix, rows, cols, i + 1, j, index + 1, str, flag)
                || search(matrix, rows, cols, i - 1, j, index + 1, str, flag)
                || search(matrix, rows, cols, i, j + 1, index + 1, str, flag)
                || search(matrix, rows, cols, i, j - 1, index + 1, str, flag)) return true;
        flag[i * cols + j] = false;
        return false;
    }
}
