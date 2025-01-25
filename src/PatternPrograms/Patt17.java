package PatternPrograms;
//        1
//      2 1 2
//    3 2 1 2 3
//      2 1 2
//        1

public class Patt17 {
    public static void main(String[] args) {
        pattern(3 );
    }
    static void pattern(int n){
        for (int row = 1; row <=2*n-1 ; row++) {
            int c=row<=n?row:2*n-row;
//            int space=row<=n?n-row:2*n-row;
            int space = n-c;
            for (int i =0; i <=space; i++) {
                System.out.print("  ");
            }
            for (int col =c; col>=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col =2; col<=c; col++) {
                System.out.print(col+" ");
            }
            System.out.println(" ");
        }

    }
}
