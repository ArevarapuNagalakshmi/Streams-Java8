package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapingNumbers {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(1,2,3,4,5,6);
        Collections.swap(l1,5,4);
        System.out.println(l1);
    }
}
