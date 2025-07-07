package Streams.BasicQuestionsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthDemo {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("apple","banana","cat","orange","grape");
        List<String>l2=l1.stream().filter(a->a.length()>5)
                .collect(Collectors.toList());
        System.out.println(l2);
    }
}
