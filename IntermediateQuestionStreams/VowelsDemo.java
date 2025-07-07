package Streams.IntermediateQuestionStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelsDemo {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("papaya","hello","help","babba","madam");
        List<String>l2=l1.stream()
                .filter(a->a.matches(".*[aeiou].*"))
                .collect(Collectors.toList());
        System.out.println(l2);

    }
}
