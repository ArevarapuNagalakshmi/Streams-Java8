package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbers {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(2,1,4,5,0,5,7,9,3);
        List<Integer>l2=l1.stream()
                .filter(n->n%2!=0)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(l2);
    }
}
