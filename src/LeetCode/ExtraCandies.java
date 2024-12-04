package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
       List<Boolean> re=kidsWithCandies(candies, extraCandies);
        System.out.println(re);

    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length - 1; i++) {
            candies[i] += extraCandies;
            if (candies[i] > candies[i + 1])
                result.add(true);
            else
                result.add(false);
            candies[i] = candies[i] - extraCandies;
        }
        return result;
    }
}
