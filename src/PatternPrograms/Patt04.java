package PatternPrograms;
//1
//1 2
//1 2 3
public class Patt04 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+"  ");
            }
            System.out.println();
        }
    }
}
