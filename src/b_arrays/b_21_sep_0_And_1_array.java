package b_arrays;

import java.util.Arrays;

//21 Separate 0's and 1's in an array ( Approach-1)
public class b_21_sep_0_And_1_array {

    public static void main(String[] args) {
        int[] a = { 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0 };

        for (int i = 0, j = a.length - 1; i < j;) {
            if (a[i] == 1 && a[j] == 0) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                i++;
                j--;
            }

            if (a[i] == 0) {
                i++;
            }

            if (a[j] == 1) {
                j--;
            }

        }

        System.out.println(Arrays.toString(a));
    }

}
