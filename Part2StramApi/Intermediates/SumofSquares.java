package Streams.Part2StramApi.Intermediates;

import java.util.Arrays;
import java.util.List;

public class SumofSquares {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(1,2,3,4);
        int l2=l1.stream()
                .map(a->a*a)
                .reduce(0,(x,y)->(x+y));
        System.out.println("Sum of square list of integers:"+l2);

        //Another way
        l2=l1.stream().mapToInt(a->a*a).sum();
        System.out.println(l2);

        int[] a=new int[]{1,2,3,4};
        int b=Arrays.stream(a)
                .map(p->p*p)
                .reduce(0,(n,m)->(n+m));
        System.out.println("Sum of square list of array:"+b);

        //Another way
        b=Arrays.stream(a).map(a1->a1*a1).sum();
        System.out.println(+b);
    }
}
