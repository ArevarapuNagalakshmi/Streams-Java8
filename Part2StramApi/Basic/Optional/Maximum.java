package Streams.Part2StramApi.Basic.Optional;

import java.util.*;

public class Maximum {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(12,34,56,78,97,578,45,78,540);
        int max=l1.stream()
                .max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Maximum value of list:"+max);

        max=l1.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(max);

        int[] a=new int[]{12,34,56,78,97,578,45,78,540};
        OptionalInt b=Arrays.stream(a).max();
        b.ifPresent(max1-> System.out.println("Maximum value of array: "+max1));

    }
}
