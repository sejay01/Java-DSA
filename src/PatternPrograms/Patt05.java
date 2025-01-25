package PatternPrograms;

public class Patt05 {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
        for (int row = 0; row <2*n ; row++) {
            int star=row<=n?row:2*n-row;
            for(int col=0;col<star;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
