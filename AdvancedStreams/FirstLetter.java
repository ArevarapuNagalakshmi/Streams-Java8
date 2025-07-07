package Streams.AdvancedStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstLetter {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("papaya","hello","help","babba","madam");
        System.out.println("Group a list of Strings by the list the first letter of each string:");
        Map<Character,List<String>>l2=l1.stream()
                .collect(Collectors.groupingBy(a->a.charAt(0)));// grouping by method is used to work with user defined objects
               l2.forEach((key,list)->{System.out.println(key+"-"+list);
               list.forEach(System.out::println);
               });
    }
}
