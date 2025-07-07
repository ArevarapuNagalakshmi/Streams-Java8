package Streams.Part2StramApi.Advanced;

import java.util.Arrays;
import java.util.List;

public class ProductArrayReduce {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(1,2,3,4,5);
        int l2=l1.stream()
                .reduce(1,(x,y)->x*y);
        System.out.println(l2);

        int[] a=new int[]{2,3,4,5,6};
        int b=Arrays.stream(a)
                .reduce(1,(x,y)->x*y);
               // .getAsInt();
        System.out.println(b);
    }
}
