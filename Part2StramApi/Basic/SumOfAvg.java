package Streams.Part2StramApi.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SumOfAvg {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4,5,6,7,8,9);
        int l2=l1.stream()
                .mapToInt(n->n.intValue())
                .sum();
       // System.out.println(l1);
        System.out.println("Sum of List :- "+l2);

       // Optional<Integer>num=l1.stream().reduce((,y)->x+y);
       // num.ifPresent(System.out::println);
        int[] n=new int[]{1,2,3,4,5,6,7,8,9};
        //l2=Arrays.stream(n).sum();
        //System.out.println(l2);
        System.out.println(l1);
        System.out.print("Average for list of Integer:- ");
        OptionalDouble avg=l1.stream()
                .mapToDouble(a->a.doubleValue())
                .average();
        if(avg.isPresent())
            System.out.println(avg.getAsDouble());

        System.out.println(l1);
        System.out.print("Average for array of Integer:- ");
        OptionalDouble avg1=Arrays.stream(n).average();
        avg1.ifPresent(System.out::println);

    }
}
