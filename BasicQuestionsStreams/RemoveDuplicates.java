package Streams.BasicQuestionsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String>l1= Arrays.asList("Hi","Hello","Hi","Hi","Hello","Bye","bye","Bye");
        List<String>l2=l1.stream()
                .distinct().collect(Collectors.toList());
        System.out.println(l2);
    }

    public static class LengthOfEachName {
        public static void main(String[] args) {
            List<String>l1= Arrays.asList("zebras","mounting","an","a","bag","chjg","hurte");
            System.out.println("Length of the each element name:");
            List<Integer>l2=l1.stream()
                    .map(a->a.length())
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println(l2);
        }
    }
}
