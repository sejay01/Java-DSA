package PatternPrograms;
//  * * *
//  * *
//  *
public class Patt03 {
    public static void main(String[] args) {
        pattern(3);
    }
    static void pattern(int n){
        for (int row =n; row >=0 ; row--) {
            for (int col = 0; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
