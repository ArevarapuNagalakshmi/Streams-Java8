package Streams.Part2StramApi.Advanced;

import java.util.Arrays;
import java.util.List;
//Implements a parallel stream that computes the sum of squre of numb ers in an array/list
public class ParallelSumOfSquareNum {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(1,2,3,4,5);
        int a=l1.parallelStream()
                .map(n->n*n)
                .reduce(1,(x,y)->x+y);
        System.out.println(a);


        int[] a1=new int[]{1,2,3,4,5};
        int a2=Arrays.stream(a1)
                .parallel()
                .map(n->n*n)
                .sum();
        System.out.println(a2);
    }
}
