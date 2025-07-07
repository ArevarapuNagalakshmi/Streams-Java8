package Streams.Part2StramApi.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingOrder {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(12,4,56,8,4,7,2,89,489,0,54,76,8,9,1,32,7);
        List<Integer>l2=l1.stream()
                .sorted()
              //  .sorted((a,b)->b-a)
               // .sorted(Comparator.comparing(Integer::intValue).reversed())
                .collect(Collectors.toList());
        System.out.println("Sorted List is: "+l2);


        int[] num=new int[]{12,4,56,8,4,7,2,89,489,0,54,76,8,9,1,32,7};
        List<Integer>Asc=Arrays.stream(num)
                .mapToObj(Integer::valueOf)
                //.boxed()
                .sorted()
                //.sorted((a,b)->b-a)
                .collect(Collectors.toList());
        System.out.println("Sorted Array is: "+Asc);

    }
}
