package leetCode;

public class InversePairs {
    public static int[] aux;

    public void InversePairs(int[] array) {
        aux = new int[array.length];
        sort(array, 0, array.length - 1);
    }

    public void sort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    public void merge(int[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (aux[i] > aux[j]) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    public static void main(String[] args) {
        InversePairs ip = new InversePairs();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 0};
        ip.InversePairs(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
