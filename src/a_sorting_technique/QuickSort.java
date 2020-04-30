package a_sorting_technique;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = { 9, 6, 5, 0, 8, 2, 7, 1, 3 };
        quicksort(a, 0, 8);
        System.out.println(Arrays.toString(a));

    }

    private static void quicksort(int a[], int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            quicksort(a, p, q - 1);
            quicksort(a, q + 1, r);

        }
    }

    public static int partition(int[] a, int p, int r) {

        int x = a[r];
        int i = p - 1;

        for (int j = p; j <= r-1 ; j++) {
            if (a[j] < x) {
                ++i;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }

        }
        ++i;
        int temp =a[i];
        a[i] = x;
        a[r] = temp;
        return i;
    }

}
