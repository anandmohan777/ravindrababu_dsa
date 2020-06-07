package b_arrays;

import java.util.Arrays;

// Find a triplet in given array that sum to given value 'x' Approach-1
//complexity = o(nlogn) + o(n2logn) = o(n2logn)
public class b_28_triplet_that_sum_x_app1 {

    public static void main(String[] args) {
        int[] a = { 6, 1, 9, 4, 7, 2 };

        int sum = 7;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int tempSum = a[i] + a[j];
                int requiredNumber = sum - tempSum;

                 //binary sort
                for (int l = j + 1, r = a.length - 1; l <= r;) {
                    int mid = (r + l) / 2;
                    if (a[mid] > requiredNumber) {
                        r = mid - 1;
                    } else if (a[mid] < requiredNumber) {
                        l = mid + 1;
                    } else {
                        System.out.println(a[i] + " " + a[j] + " " + a[mid]);
                        break;

                    }

                }

            }
        }

    }

}
