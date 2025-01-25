package PatternPrograms;
//    4 4 4 4 4 4 4
//    4 3 3 3 3 3 4
//    4 3 2 2 2 3 4
//    4 3 2 1 2 3 4
//    4 3 2 2 2 3 4
//    4 3 3 3 3 3 4
//    4 4 4 4 4 4 4
public class Patt31 {
    public static void main(String[] args) {
        Patt31(3);
    }
    static void Patt31(int n){
        int On=n+1;
        n=2*n;
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n; col++) {
                int atEveryIndex=On - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
