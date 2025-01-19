package SortAlgo;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] array={4,5,3,2,1};
        CyclicSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void CyclicSort(int[] a){
        int i=0;
        while(i<a.length){
            int correct=a[i]-1;
            if (a[i] != a[correct]) {
                Swap(a,i,correct);
            }
            else
                i++;
        }
    }
    static void Swap(int[] array,int max, int end){
        int temp = array[max];
        array[max]=array[end];
        array[end]=temp;
    }
}
