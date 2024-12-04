package LeetCode;

public class Palindrome {
    public static void main(String[] args) {
        int n=1213;

        System.out.println(CheckPali(n));
    }
    static Boolean CheckPali(int n){
        int rev=0;
        int temp=n;
        while(n!=0)
        {
            int r=n%10;
            rev=(rev*10)+r;
            n/=10;
        }
        if(rev==temp)
            return true;
        else
            return false;
    }
}
