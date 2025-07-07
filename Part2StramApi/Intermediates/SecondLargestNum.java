package Streams.Part2StramApi.Intermediates;

import java.util.Arrays;
import java.util.List;

public class SecondLargestNum {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(3,4,2,1,6,5,8,3,8);
        int l2=l1.stream().sorted((a,b)->b-a)
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second Largest Number List of Integer"+l2);


        int[] n=new int[]{3,4,2,1,6,5,8,3,8};
        int p=Arrays.stream(n)
                .boxed()
                .sorted((a1,b1)->b1-a1)
                .skip(1)
                .findFirst().get();
        System.out.println(p);
    }
}
