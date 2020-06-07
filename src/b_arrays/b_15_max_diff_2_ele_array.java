package b_arrays;

public class b_15_max_diff_2_ele_array {

    public static void main(String[] args) {

        int[] a = { 2, 3, 5, 4, 7, 5, 100, 1,200,0 };

        int mina = a[0];
        int minb = a[1];
        int minsoFar = Math.min(a[0], a[1]);
        int maxDiff = minb - mina;
        for (int i = 2; i < a.length; i++) {
            int diff = a[i] - minsoFar;
            if (diff > maxDiff) {
                maxDiff = diff;
                mina = Math.min(minsoFar, a[i]);
                minb = Math.max(minsoFar, a[i]);
                minsoFar = mina;
            }
            
            if (a[i] < minsoFar) {
                minsoFar = a[i];
            }
        }

        System.out.println(mina + " : " + minb);
    }
}
