package Streams.Part2StramApi.Basic.Optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class Minimum {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(12,34,56,78,97,578,45,78,540);
        int min=l1.stream()
                .min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Minimum value of list:"+min);

        min=l1.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println(min);

        int[] a=new int[]{12,34,56,78,97,578,45,78,540};
        OptionalInt b=Arrays.stream(a).min();
        b.ifPresent(min1-> System.out.println("Minimum value of array: "+min1));

    }
}
