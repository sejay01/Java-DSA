package LeetCode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums ={2,7,11,15};
        int target=9;
        int index[]=twoSum(nums,target);
        System.out.println(Arrays.toString(index));
    }
    static int[] twoSum(int[] nums,int target){
        for(int a:nums) {
            for(int b:nums){
                if(a+b==target)
                    return new int[] {a,b};
            }
        }
        return  new int[] {-1,-1};
    }
}
