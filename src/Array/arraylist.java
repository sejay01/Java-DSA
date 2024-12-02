package Array;

import java.util.*;

public class arraylist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> cars= new ArrayList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);


        System.out.println(cars.get(0));
    }


}
