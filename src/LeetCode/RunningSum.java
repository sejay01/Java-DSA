package LeetCode;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
       int[] res= runningSum(nums);
        System.out.println(Arrays.toString(res));
    }
    static int[] runningSum(int[] nums) {
        int[] runningSum=new int[nums.length];
        runningSum[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {

            runningSum[i]=runningSum[i-1]+nums[i];
        }
        return runningSum;
    }
}
