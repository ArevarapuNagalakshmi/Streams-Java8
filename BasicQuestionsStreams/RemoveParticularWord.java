package Streams.BasicQuestionsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveParticularWord {
    public static void main(String[] args) {
        List<String>l1= Arrays.asList("hi","papa","mama","sis","bro","apple","net");
        System.out.println("Remove words starting with m");
        List<String>l2=l1.stream()
                .filter(a->!a.startsWith("m"))
                .collect(Collectors.toList());
        System.out.println(l2);
    }
}
