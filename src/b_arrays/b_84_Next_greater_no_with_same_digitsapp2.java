package b_arrays;

import java.util.Arrays;

//84 Next greater number with same set of digits Approach-2
public class b_84_Next_greater_no_with_same_digitsapp2 {

    public static void main(String[] args) {
        String temp = "123456784987654321";
        int[] s = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            s[i] = temp.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(s));

        int left = -1;
        for (int i = s.length -1; i-1 >= 0 ; i--) {
            if(s[i-1] < s[i]) {
                left = i-1;
                break;
            }
        }

        if(left == -1 ) {
            System.out.println("cant produce");
        }

        int diffSoFar= Integer.MAX_VALUE;
        int index = 0;
        for (int i = left + 1; i < s.length ; i++) {
            int tempdiffSoFar = s[i] - s[left];
            if(tempdiffSoFar < diffSoFar && tempdiffSoFar>0) {
                diffSoFar = tempdiffSoFar;
                index = i;
            }
        }

        int temp1 = s[left];
        s[left] = s[index];
        s[index] =temp1;

        for(int i =left+1, r = s.length -1; i <= r ; i++ , r--) {
            int temp2 = s[i];
            s[i] = s[r];
            s[r] =temp2;
        }

        System.out.println(Arrays.toString(s));
    }
}
