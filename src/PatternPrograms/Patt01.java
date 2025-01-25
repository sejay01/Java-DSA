package PatternPrograms;
/*
    * * *
    * * *
    * * *
 */
public class Patt01 {
    public static void main(String[] args) {
        pattern(3);
    }

    static void pattern(int i) {
        for (int row = 0; row <= i; row++) {
            for (int col = 0; col < i; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
