package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Swaping {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("A","B","C","D");
        Collections.swap(l1,1,2);
        System.out.println(l1);
    }
}
