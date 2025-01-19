package SortAlgo.Leet;

import java.util.List;
// use list array to find multiple duplicate elements
public class FIndDuplicate {
    public static void main(String[] args) {
        int[] array={4,3,2,7,8,2};

        System.out.println(findDuplicate(array));
    }
    public static int findDuplicate(int[] arr) {
        int i=0;
        while (i < arr.length) {
            if(arr[i]!=i+1){
                int crt = arr[i] - 1;
                if (crt >= 0 && crt < arr.length && arr[i] != arr[crt]) {
                    Swap(arr, i, crt);
                } else {
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    static void Swap(int[] array,int max, int end){
        int temp = array[max];
        array[max]=array[end];
        array[end]=temp;
    }
}
