package Streams.Part2StramApi.Advanced.TwoDimArray;


import java.util.Arrays;
import java.util.List;
//sum of numbers of a two dimensional array and list of list of integers
public class SumTwoDim {
    public static void main(String[] args) {
        List<List<Integer>>l= Arrays.asList(
                Arrays.asList(1,2,3,4,5),
                Arrays.asList(6,7,8,9,0));
        int l1=l.stream()
                .flatMap(a->a.stream())
                .reduce((x,y)->x+y)
                .get();
        System.out.println(l1);
//Another Way
//        l1=l.stream()
//                .flatMap(i->i.stream())
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println(l1);


        int[][] a=new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6}};
        int sum=Arrays.stream(a)
                .flatMapToInt(p->Arrays.stream(p))
                .sum();
        System.out.println(sum);
    }
}
