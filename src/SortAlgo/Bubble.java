package SortAlgo;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] array={4,5,3,2,1};
        bubblesort(array);
        System.out.println(Arrays.toString(array));
    }
    static void bubblesort(int[] arr){
        boolean swap=false;
        for(int i=0;i< arr.length;i++){

            for(int j=1;j< arr.length-i;j++){

                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap)
                break;
        }
    }
}
