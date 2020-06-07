package b_arrays;

import java.util.Arrays;

//finding the pair in the given array whose sum is closed to zero
public class b_25_sum_close_to_0 {

    public static void main(String[] args) {
        int[] a = { -2, 9, 6, 1, 2, -5 };

        Arrays.sort(a);

        int p = 0;
        int q = 0;
        int minSumSoFar = Integer.MAX_VALUE;
        for (int i = 0, j = a.length - 1; i < j;) {
            int sum = a[i] + a[j];
            if (Math.abs(minSumSoFar) > Math.abs(sum)) {
                minSumSoFar = sum;
                p = a[i];
                q = a[j];
                j--;
            } else {
                i++;
            }
        }

        System.out.println(p + " : " + q);

    }

}
