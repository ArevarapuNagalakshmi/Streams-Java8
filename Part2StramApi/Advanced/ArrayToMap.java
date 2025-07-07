package Streams.Part2StramApi.Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayToMap {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(1,2,3,4,5);
        Map<Integer,Integer> l2=l1.stream()
                .collect(Collectors.toMap(n1->n1,n2->n2*n2));
        System.out.println(l2);

        int[] num = new int[] {10, 20, 30, 40};
        List<String> num2 = Arrays.stream(num)
                //.map(a->a*a)
                .mapToObj(a -> a + "-" + (a * a))
                .collect(Collectors.toList());
        System.out.println(num2);

    }
}
