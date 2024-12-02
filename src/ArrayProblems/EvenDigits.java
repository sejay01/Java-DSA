package ArrayProblems;

//find the no of elements with even digits

public class EvenDigits {

    public static void main(String[] args) {

        int[] arr = {1,23,564,67,8965};
        int c=FindEven(arr);
        System.out.println(c);
    }
    static int FindEven(int arr[])
    {
        int count=0;
     for(int num:arr)
     {
         if(even(num)) {
             count++;
         }
     }
     return count;
    }
    static boolean even(int num){
        int flag=0;
        if(num==0)
        {
            flag=1;
        }
        while(num!=0)
        {
            num=num/10;
            flag++;
        }
        if(flag%2==0)
            return true;
        else
            return false;
    }
}
