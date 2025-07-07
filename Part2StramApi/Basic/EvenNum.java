package Streams.Part2StramApi.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNum {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(1,3,6,2,1,54612,455,6,223,55,73,1,3,89);
        List<Integer>l2=l1.stream().filter(a->a%2==0)
                .collect(Collectors.toList());
        System.out.println(l2);

        System.out.println();
        int[] num1=new int[]{1,3,6,2,1,54612,455,6,223,55,73,1,3,89};
                 Arrays.stream(num1)
                .filter(a->a%2==0)
//                         .distinct()
//                         .sorted()
               .forEach(num->System.out.println(num));
    }
}
