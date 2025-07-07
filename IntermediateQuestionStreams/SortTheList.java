package Streams.IntermediateQuestionStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheList {
    public static void main(String[] args) {
        List<String>l1= Arrays.asList("papaya","hello","help","babba","madam");
        System.out.println("Sort the list of the element in Ascending order");
        List<String>l2=l1.stream()
                //.sorted((a1,a2)->((Integer)a1.length()).compareTo(a2.length()))
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(l2);

        System.out.println("Sort the list of the element in Descending order");
        List<String>l3=l1.stream()
                //.sorted((a1,a2)->((Integer)a2.length()).compareTo(a1.length()))
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());
        System.out.println(l3);
    }
}