package Streams.IntermediateQuestionStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveAllStrings {
    public static void main(String[] args) {
        List<String>l1= Arrays.asList("papaya","","hello","","help",null,"babba","madam",null,"null");
        List<String>l2=l1.stream()
                .filter(a->a!=null&&(!a.isEmpty()))
                .collect(Collectors.toList());
        System.out.println(l2);
    }
}
