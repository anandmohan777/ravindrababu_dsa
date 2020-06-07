package b_arrays;

// 47 Find the sub array with given sum X (Approach-1)
public class b_47_subarray_given_sum_app1 {

    public static void main(String[] args) {
        int arr[] = {5, 4, 6, 7, 9, 8, 3, 1, 2};
        int sum = 21;

        int sumSoFar = arr[0];
        for (int i = 0, j = 1; i < arr.length && j < arr.length && i < j; ) {
            if (sumSoFar < sum) {
                sumSoFar = sumSoFar + arr[j];
                if (sumSoFar == sum) {
                    System.out.println((i+1) + " " + (j+1));
                    return;
                }
                j++;
            } else if (sumSoFar > sum) {
                sumSoFar = sumSoFar - arr[i];
                if (sumSoFar == sum) {
                    System.out.println((i+1) + " " + (j+1));
                    return;
                }
                i++;
            }
        }

    }

}
