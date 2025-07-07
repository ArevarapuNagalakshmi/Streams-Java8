package Streams.Part2StramApi.Intermediates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(12, 4, 56, 8, 4, 7, 2, 89, 489, 0, 54, 76, 8, 9, 1, 32, 67);
        List<Integer>l2=l1.stream().distinct().sorted()
                .collect(Collectors.toList());
        System.out.println("List of integers:"+l2);

        int[] n=new int[]{12,34,4,2,4,3,1,2,3,4,25,6,5,6,57,56,78,97,578,45,78,540};
        List<Integer> n1=Arrays.stream(n).distinct().sorted().boxed()
                .collect(Collectors.toList());
        System.out.println("List of arrays:"+n1);


    }
}
