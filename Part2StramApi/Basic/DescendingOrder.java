package Streams.Part2StramApi.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(12,4,56,8,4,7,2,89,489,0,54,76,8,9,1,32,7);
        List<Integer>l2=l1.stream()
                .sorted((a,b)->b-a)
                .collect(Collectors.toList());
        System.out.println("Descending order is :"+l2);


        int[] num=new int[]{12,4,56,8,4,7,2,89,489,0,54,76,8,9,1,32,7};
        List<Integer>des=Arrays.stream(num)
                .boxed()
              // .mapToObj(n->Integer.valueOf(n))
               // .mapToObj(Integer::valueOf)
                .sorted((a,b)->b-a)
                .collect(Collectors.toList());
        System.out.println("Descending order is :"+des);

    }
}
