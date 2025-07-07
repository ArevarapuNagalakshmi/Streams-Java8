package Streams.Part2StramApi.Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("List to Integers:");
        List<Integer> l1= Arrays.asList(1,2,3,4,5);
        Map<Boolean,List<Integer>>l2=l1.stream()
                .collect(Collectors.partitioningBy(num->num%2==0));
        System.out.println("Even Numbers:"+l2.get(true));
        System.out.println("Odd Numbers:"+l2.get(false));

        System.out.println("Arrays to Integers:");
        int[] num=new int[]{1,2,3,4,5,6,7,8};
        Map<Boolean,List<Integer>>num1=Arrays.stream(num)
                .boxed()
                .collect(Collectors.partitioningBy(a1->a1%2==0));
        System.out.println("Even Numbers:"+num1.get(true));
        System.out.println("Odd Numbers:"+num1.get(false));

    }
}
