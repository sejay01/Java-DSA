package SearchAlgo;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66,77,88,99};
        int target=77;
        int index=bs(arr,77);
        System.out.println(index);
    }

     static int bs(int[] arr, int i) {
        int start=0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid =start+(end-start)/2;
            if(arr[mid]<i) {
                start = mid + 1;
            }
            else if (arr[mid]>i) {
                end=mid-1;
            }
            else
                return mid ;

        }
        return -1;
    }

}
