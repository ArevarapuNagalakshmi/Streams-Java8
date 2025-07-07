package Streams.BasicQuestionsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckParticularWord {
    public static void main(String[] args) {
        List<String>l1= Arrays.asList("Hi","Hello","Bye","Hi","His","Hite");
        List<String>l2=l1.stream()
                //.filter(a->a.contains("Hi"))
                .filter(a->a.contains("e"))
                .collect(Collectors.toList());
        System.out.println(l2);
    }
}
