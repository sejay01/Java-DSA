package LeetCode;

import java.util.Arrays;

//== nums [i] and for 1 < n
//Given an integer array nuns of length n ' you want to create an array ans
//(O-indexed).
//Specifically, ans is the concatenation of two nums arrays.
//Return the array ans
//of length 2n
//where ans [i]
public class Concatenation {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        int res[]=getConcatenation(nums);
        System.out.println(Arrays.toString(res));


    }
  static int[] getConcatenation(int[] nums) {

        int[] res = new int[2*nums.length];
        for(int i=0;i<res.length;i++)
        {
           res[i] =nums[i % nums.length];
        }
        return res;
    }

}

