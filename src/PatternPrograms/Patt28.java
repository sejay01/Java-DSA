package PatternPrograms;
//        *
//       * *
//      * * *
//       * *
//        *
public class Patt28 {
    public static void main(String[] args) {
        pattern(9);
    }
    static void pattern(int n){
        for (int row = 0; row <2*n ; row++) {
            int star=row<=n?row:2*n-row;
            int space=n-star;
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for(int col=0;col<star;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
