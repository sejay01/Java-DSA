package ArrayProblems;
// leetcode problem: richest customer
public class MaximumWealth {

    public static void main(String[] args) {
        int[][] acc={{1,2,3},{5,6,7},{23,65,8}};
        int n =maxw(acc);
        System.out.println(n);
    }
    private static int maxw(int[][] acc) {
        int max=-1;
        for(int[] a:acc) {
            int sum=0;
            for(int amt:a){
                sum+=amt;
            }
            if(sum>max) {
                max = sum;
            }
        }
        return max;
    }
}
