package PatternPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
    *
    * *
    * * *
*/
public class Patt02 {
    public static void main(String[] args) {
        Pattern(4);
    }

     static void Pattern(int n) {
         for (int row = 1; row <= n; row++) {
             for (int col = 1; col <=row ; col++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
}
