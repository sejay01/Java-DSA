package SortAlgo.Leet;

public class FindSmallestPositive {
    public static void main(String[] args) {
        int[] array={1,2,3,5,4 };
        int missing=SmallestNumber(array);
        System.out.println(missing);
    }

     static int SmallestNumber(int[] array) {
        int i=0;
        while(i<array.length){
            int crt=array[i]-1;
            if(array[i]>0 && array[i]<array.length && array[i]!=array[crt])
            {
                Swap(array,i,crt);
            }
            else
                i++;

    }
        for(int ind=0;ind< array.length;ind++)
        {
            if(array[ind]!=ind+1)
                return ind+1;
        }
        return array.length+1;
    }
    static void Swap(int[] array,int max, int end){
        int temp = array[max];
        array[max]=array[end];
        array[end]=temp;
    }
}
