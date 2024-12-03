package LeetCode;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        int[] res=shuffle(nums,n);
        System.out.println(Arrays.toString(res));

    }
    static int[] shuffle(int[] nums, int n) {

        int shuffled[]=new int[2*n];
        for (int i = 0; i < n; i++) {
            shuffled[2 * i] = nums[i];         // Insert xi at even indices
            shuffled[2 * i + 1] = nums[i + n]; // Insert yi at odd indices
        }
        return nums;
    }
}
