package b_arrays;

import java.util.Arrays;

// 32 Find the equilibrium index in an array
public class b_32_equilibrium_index {

    public static void main(String[] args) {
        int[] a = {10, 5, 15, 3, 4, 21, 2};
        //int[] a = {10, 5, 15};
        int isum = a[0];
        int jsum = a[a.length-1];
        for (int i = 1, j = a.length-2 ; i <= j +1; ) {
            if(i  == j +1) {
                if(isum == jsum ) {
                    System.out.println("equilibrium index "+ (i));
                } else {
                    System.out.println(" no equilibrium index ");
                }
                break;
            } else if (isum < jsum) {
                isum += a[i] ;
                i++;
            } else if(isum > jsum) {
                jsum += a[j];
                j--;
            }
        }

    }

}
