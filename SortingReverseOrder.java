package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingReverseOrder {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(20,30,1,4,2,3,0,5);
       List<Integer>l2= l1.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(l2);
                //.forEach(System.out::println);
    }
}
