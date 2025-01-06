package SortAlgo;

import java.util.Arrays;

public class SelectionAlgo {

    public static void main(String[] args) {
        int[] array={4,5,3,2,1};
        SelectSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void SelectSort(int[]array){
        int end=array.length-1;
        for(int i=0;i< array.length;i++){

            int max=Max(array,0,end);
            Swap(array,max,end);
            end--;
        }
    }
    static int Max(int[] array,int start,int end){
        int m=start;
        for(int i=start+1;i<=end;i++)
        {
            if(array[i]>array[m]) {
                m = i;
            }
        }
        return m;
    }
    static void Swap(int[] array,int max, int end){
        int temp = array[max];
        array[max]=array[end];
        array[end]=temp;
    }
}
