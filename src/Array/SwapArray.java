package Array;

import java.util.Arrays;


public class SwapArray {

    public static void main(String[] args) {

        int[] arr ={1,4,6,78,9};

        swap(arr,4,2);

    }
    static void swap(int arr[],int a,int b)
    {

        int temp =0;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

        System.out.println(Arrays.toString(arr));
    }
}
