package Streams;

import java.util.Arrays;
import java.util.List;

public class One {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("Dhoni","Kholi","Rohit");
        String s=l1.stream().filter(n->n.equalsIgnoreCase("Grill"))
                .findAny().get();
        System.out.println(s);
    }
}
