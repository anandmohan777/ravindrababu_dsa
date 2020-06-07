package b_arrays;

//Find the number occurring odd number of times in a given array of size 'n'
public class b_18_numb_occ_odd_time {

    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 1, 1, 3 };

        int result = 0;
        for (int i = 1; i <= a.length; i++) {
            result = a[i - 1] ^ a[1];
        }

        System.out.println(result);

    }

}
