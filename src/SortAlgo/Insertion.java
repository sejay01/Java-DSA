package SortAlgo;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] array={4,5,3,2,1};
        InsertSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void InsertSort(int[] array){
        for(int i=0;i< array.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(array[j]<array[j-1])
                    Swap(array,j,j-1);
                else
                    break;
            }
        }
    }
    static void Swap(int[] array,int max, int end){
        int temp = array[max];
        array[max]=array[end];
        array[end]=temp;
    }
}
