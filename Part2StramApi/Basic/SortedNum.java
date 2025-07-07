package Streams.Part2StramApi.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNum {
    public static void main(String[] args) {
        System.out.println("Sorted List is:");
        List<Integer>l1= Arrays.asList(12,4,56,8,4,7,2,89,489,0,54,76,8,9,1,32,7);
        List<Integer>l2=l1.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(l2);

        System.out.println("Sorted Array is:");
        int[] n=new int[]{12,4,56,8,4,7,2,89,489,0,54,76,8,9,1,32,7};
         List<Integer>m= Arrays.stream(n)
                   .sorted()
                 .boxed()//it converts into int to integer
                   .collect(Collectors.toList());
           System.out.println(m);

    }
}
