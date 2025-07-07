package Streams;

import java.util.Arrays;

public class ThirdSmallestEle {
    public static void main(String[] args) {
        int[] arr={12,3,4,5,1,2};
        int n=3;
        Arrays.stream(arr).sorted()
                .skip(n-1).findFirst().ifPresent(System.out::println);
    }
}
