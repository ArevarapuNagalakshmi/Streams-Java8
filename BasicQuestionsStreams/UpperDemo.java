package Streams.BasicQuestionsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperDemo {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("cat","apple","banana","carrot","ant");
        List<String>l2=l1.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(l2);

    }
}
