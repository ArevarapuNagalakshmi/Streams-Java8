package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNum {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(95,55,510,20,30,35,45,25,40,50,10,20,20,30,80);
        List<Integer>l2= l1.stream()
                .filter(n->n%2==0)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(l2);
    }
}
