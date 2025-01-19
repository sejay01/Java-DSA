package SortAlgo.Leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleDuplicates {
    public static void main(String[] args) {
        int[] array={4,3,2,7,8,2,3,1};
       System.out.println(findDuplicates(array));
    }
    public static List<Integer> findDuplicates(int[] arr) {
        int i=0;
        while (i < arr.length) {
                int crt = arr[i] - 1;
                if (crt >= 0 && crt < arr.length && arr[i] != arr[crt]) {
                    Swap(arr, i, crt);
                }
                else{
                i++;
                }
        }
        List<Integer> ans= new ArrayList<>();
        for(int index=0;index< arr.length;index++){
            if(arr[index]!=index+1)
                ans.add(index+1);
        }
        return ans;
    }
    static void Swap(int[] array,int max, int end){
        int temp = array[max];
        array[max]=array[end];
        array[end]=temp;
    }
}
