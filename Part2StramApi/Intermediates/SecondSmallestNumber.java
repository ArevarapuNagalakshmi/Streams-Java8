package Streams.Part2StramApi.Intermediates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(1,2,4,3,56,7,0,45,12,23,35);
        List<Integer>l2=l1.stream().sorted()
//                .collect(Collectors.toList());
//        int a=l2.get(1);
//        System.out.println(a);

        //Another way
                .skip(1)
                .limit(1)
                .collect(Collectors.toList());
        System.out.println("Second Smallest Number:"+l2.get(0));

        int[] a=new int[]{1,2,4,3,56,7,0,45,12,23,35};
        int[] b=Arrays.stream(a)
                .sorted()
                .skip(1)
                .limit(1)
                .toArray();
        System.out.println("Second Smallest Number:"+b[0]);
            //Another way
//        int[] b1=Arrays.stream(a)
//                .mapToObj(Integer::valueOf)
//                .sorted()
//                .skip(1)
//                .findFirst()
//                .get();
//        System.out.println(b1);

    }
}
