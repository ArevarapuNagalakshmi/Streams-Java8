package Streams.Part2StramApi.Basic;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenOddRange {
    public static void main(String[] args) {
        System.out.println("To Print the even numbers:-");
       String even= IntStream.rangeClosed(1,15)
                .filter(a->a%2==0)
              // .mapToObj(n->n+","+n)
               .mapToObj(String::valueOf)
               .collect(Collectors.joining(" "));
       System.out.println(even);


        System.out.println("To Print the odd numbers:-");
        String odds=IntStream.rangeClosed(1,15)
                .filter(a->a%2!=0)
               // .mapToObj(m->m+","+m)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(odds);
    }
}
