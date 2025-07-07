package Streams.IntermediateQuestionStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachString {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("papaya","hello","help","babba","madam");
          System.out.println("Each string is reversed from the original list:");
          List<String>l2=l1.stream()
                  .map(a->new StringBuilder(a).reverse().toString())
                  .collect(Collectors.toList());
          System.out.println(l2);
    }
}
