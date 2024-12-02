package Array;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Array2D {
    public static void main(String[] args) {

        int [][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);

        for(int i=0;i<arr.length;i++)
        {

            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter the Element:");
                arr[i][j]=in.nextInt();

            }

        }
        for(int i=0;i<arr.length;i++)
        {

            for(int j=0;j<arr[i].length;j++)
            {

                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }


    }
}