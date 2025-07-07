package Streams.Part2StramApi.Basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxWithOutOptional {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(12, 4, 56, 8, 4, 7, 2, 89, 489, 0, 54, 76, 8, 9, 1, 32, 67);
        int max= Collections.max(l1);
        System.out.println("The maximum number is:"+max);
        int max1=Collections.min(l1);
        System.out.println("The Minimum number is:"+max1);

    }
}
