package SearchAlgo;

import java.lang.module.FindException;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6, 7, 4};

        System.out.println(linear(arr,4));
    }

    static int linear(int[] arr, int K) {
        for (int index = 0; index < arr.length; index++)
        {
            if (arr[index] == K)
                return index;
        }
        return -1;
    }
}
