package Array;

public class MaxInArr
{

    public static void main(String[] args) {

        int[] arr ={2,57,58,8,99,7};

        System.out.println(max(arr));

    }
    static int max(int[] arr)
    {
        int m=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>m) {

                m = arr[i];

            }
        }
        return m;
    }

}
