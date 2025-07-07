package Streams.Part2StramApi.Intermediates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaresList {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(1,2,3,4,5);
        List<Integer>l2=l1.stream().map(a->a*a)
                .collect(Collectors.toList());
        System.out.println("Square of the list of integers:"+l2);


        int[] n=new int[]{1,2,3,4,5};
       List<Integer>n1=Arrays.stream(n)
       // List<Double>n1=Arrays.stream(n)
               // .map(a->a*a)
                .mapToDouble(a->Math.pow(a,2))
                .mapToInt(doubleval->(int)doubleval)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Squares of the Arrays of Integer"+n1);

    }
}
