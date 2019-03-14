package leetCode;

public class multiply {
//    public int[] multiply(int[] A) {
//        int[] result = new int[A.length];
//        int sum = 1;
//
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; j < A.length; j++) {
//                if (i != j) {
//                    sum *= A[j];
//                }
//            }
//            result[i] = sum;
//            sum = 1;
//        }
//        return result;
//    }

    public int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        if (len != 0) {
            B[0] = 1;
            for (int i = 1; i < len; i++) {
                B[i] = B[i - 1] * A[i - 1];
            }
            int temp = 1;
            for (int j = len - 2; j >= 0; j--) {
                temp *= A[j + 1];
                B[j] *= temp;
            }
        }
        return B;
    }

    public static void main(String[] args) {
        multiply m = new multiply();
        int[] A = {1, 2, 3, 4};
        int[] result = m.multiply(A);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
