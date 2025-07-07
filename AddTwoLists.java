package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddTwoLists {
    public static void main(String[] args) {
        List<String>l1= Arrays.asList("Hello","Hi","Bye");
        List<String>l2=Arrays.asList("Hi","Hello","Many","More","much");
        List<String>Add= Stream.concat(l1.stream(),l2.stream())
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(Add);
    }
}
