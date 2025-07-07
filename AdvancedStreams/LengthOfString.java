package Streams.AdvancedStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LengthOfString {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("papaya","hello","help","babba","madam");
        System.out.println("group a list of string by the length of the string:");
       Map<Integer,List<String>> l2=l1.stream()
                .collect(Collectors.groupingBy(String::length));
       l2.forEach((key,list)->{
           System.out.println(key+"-"+list);
                });
    }
}
