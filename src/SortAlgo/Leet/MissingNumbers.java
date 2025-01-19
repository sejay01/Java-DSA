package SortAlgo.Leet;

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] array={4,0,1,2};
        int missing_no=Sort(array);
        System.out.println(missing_no);

    }
    //sorting the array
    static int Sort(int[] array){
        int i=0;
        while(i<array.length){
            int crt =array[i];
            if(array[i]< array.length && array[i]!=array[crt])
                Swap(array,crt,i);
            else
                i++;
        }
        //search the missing number
        for(int ind=0;ind<array.length;ind++){
            if(array[ind]!=ind)
                return ind;
        }
        return array.length;
    }

    static void Swap(int[] array,int max, int end){
        int temp = array[max];
        array[max]=array[end];
        array[end]=temp;
    }
}
