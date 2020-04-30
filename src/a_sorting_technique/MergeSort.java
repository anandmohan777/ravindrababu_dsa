package a_sorting_technique;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = { 9, 6, 5, 0, 8, 2, 7, 1, 3 };
        mergeSort(a, 0, 8);
        System.out.println(Arrays.toString(a));

    }

    public static void mergeSort(int a[], int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;

            mergeSort(a, p, q);
            mergeSort(a, q + 1, r);
            merge(a, p, q, r);

        }
    }

    public static void merge(int a[], int p, int q, int r) {
        int[] m = new int[q - p + 1];
        int[] n = new int[r - q];

        for (int i = 0; i < m.length; i++) {
            m[i] = a[p + i];
        }

        for (int i = 0; i < n.length; i++) {
            n[i] = a[q + i];
        }

        for (int i = p, j = q, k = 1; k < r - p; k++) {
            if (m[i] > n[j]) {
                a[p + k] = n[j];
                ++j;
            } else if (m[i] < n[j]) {
                a[p + k] = m[i];
                ++i;
            }

            if (j == r) {
                a[p + k] = m[i];
                ++i;
            } else if (p == q) {
                a[p + k] = n[j];
                ++j;
            }
        }

    }

}
