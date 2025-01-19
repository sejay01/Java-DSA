package SortAlgo.Leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find—all-numbers-disappeared-in-an-array/
//asked in Google
public class DisplayMissingNumbers {
    public static void main(String[] args) {
        int[] array={4,3,2,7,8,2,3,1};
        List<Integer> missingNumbers = cyclic(array);
        System.out.println("Missing numbers: " + missingNumbers);

    }
    private static List<Integer> cyclic(int[] a) {
        int i=0;
        List<Integer> missing = new ArrayList<>();
        while(i<a.length){
            int crt = a[i]-1;
            if(a[i] > 0 && a[i] <= a.length && a[i]!=a[crt]) {
                Swap(a, i, crt);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] != j + 1) {
                missing.add(j + 1);
            }
        }
        return missing;
    }
    static void Swap(int[] array,int max, int end){
        int temp = array[max];
        array[max]=array[end];
        array[end]=temp;
    }
}
