package Streams.AdvancedStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LastLetter {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("papaya","hello","help","babba","madam");
        System.out.println("Group a list of Strings by the list the last letter of each string and value of string that end with that letter:");
        Map<Character,List<String>> l2=l1.stream()
                .collect(Collectors.groupingBy(a->a.charAt(a.length()-1)));// grouping by method is used to work with user defined objects
        l2.forEach((key,list)->{System.out.println(key+"-"+list);
            list.forEach(System.out::println);
        });
    }
}
