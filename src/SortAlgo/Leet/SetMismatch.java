package SortAlgo.Leet;

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {


        int[] array={2,1,4,2,6,5};
        int[] missing_no=Sort(array);
        System.out.println(Arrays.toString(missing_no));

    }
    //sorting the array
    static int[] Sort(int[] array){
        int i=0;
        while(i<array.length){
            int crt =array[i]-1;
            if(array[i]< array.length && array[i]!=array[crt])
                Swap(array,crt,i);
            else
                i++;
        }
        //search the missing number
        for(int ind=0;ind<array.length;ind++){
            if(array[ind]!=ind+1) {
                 return new int[] {array[ind],ind+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void Swap(int[] array,int max, int end){
        int temp = array[max];
        array[max]=array[end];
        array[end]=temp;
    }
}

