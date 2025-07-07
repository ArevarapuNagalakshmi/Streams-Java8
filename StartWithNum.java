package Streams;

import java.util.Arrays;
import java.util.List;

public class StartWithNum {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("1Apple","2Banana","date");
        l1.stream().filter(n->!n.isEmpty()&&Character.isDigit(n.charAt(0)))
                .forEach(System.out::println);
    }
}
