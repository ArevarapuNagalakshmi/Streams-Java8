package Streams;

import java.util.Arrays;
import java.util.List;

public class PrimeNum {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(4,6,8,9,11,15,16);
        l1.stream()
                .filter(PrimeNum::B)
                .forEach(System.out::println);

    }
    public static boolean B(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
