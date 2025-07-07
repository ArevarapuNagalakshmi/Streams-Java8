package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingReversedOrder1 {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(11,8776,6,1,4,2);
        l1.stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
