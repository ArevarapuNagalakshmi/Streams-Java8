package Streams.IntermediateQuestionStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SingleString {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("papaya","hello","help","babba","madam");
         System.out.println("List of Strings into single string,separated by commas:");
         String l2=l1.stream()
                 .collect(Collectors.joining(","));
         System.out.println(l2);
        // System.out.println(l1);
    }
}
