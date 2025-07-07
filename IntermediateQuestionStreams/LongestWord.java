package Streams.IntermediateQuestionStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestWord {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("papaya fruits","hello","help","java full stack","madam");
        Optional<String> l2=l1.stream()
                .max(Comparator.comparing(String::length));
                l2.ifPresent(a->System.out.println(a.toUpperCase()));

    }
}
