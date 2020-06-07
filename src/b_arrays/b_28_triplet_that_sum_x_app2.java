package b_arrays;

import java.util.Arrays;

// 29 Find a triplet in given array that sum to given value 'x' Approach-2
public class b_28_triplet_that_sum_x_app2 {

    public static void main(String[] args) {
        int[] a = { 6, 1, 9, 4, 7, 2 };

        int sum = 15;
        Arrays.sort(a);
        
        for (int i = 0; i < a.length; i++) {
            for (int p = i + 1, q=a.length-1; p < q;) {
                int tempSum = a[i] + a[p]+a[q];
                    if(tempSum >  sum ) {
                        q--;
                    } else if(tempSum <  sum ) {
                        p++;
                    } else {
                        System.out.println(a[i] + " " + a[p] + " " + a[q]);
                        break;
                    }
            }
        }

    }

}
