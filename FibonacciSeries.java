package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        //Stream.iterate(new int[]{0,1}, a->new int[]{a[1],a[0]+a[1]})
        List<Integer> l1=Stream.iterate(new int[]{0,1}, a->new int[]{a[1],a[0]+a[1]})
                .limit(10)
                .map(a->a[0])
                //.forEach(System.out::println);
                .collect(Collectors.toList());
        System.out.println(l1);
    }
}
