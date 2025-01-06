package LeetCode;

public class numIdenticalPairs {
    public static void main(String[] args) {
            int[] nums = {1,2,3,1,1,3};
            int no=IdenticalPairs(nums);
            System.out.println(no);
    }
    public static int IdenticalPairs(int[] num)
    {
        int count=0;
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]==num[j])
                    count++;
            }
        }
        return count;
    }
}
