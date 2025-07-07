package Streams.AdvancedStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VowelsAndConsonents {
    public static void main(String[] args) {
        List<String>l1= Arrays.asList("ab","bdk","cn","sjd","wt","iwqo","bafs");
        Predicate<String>p=a->a.matches(".*[aeiou].*");
        Map<Boolean,List<String>>m=l1.stream()
                .collect(Collectors.partitioningBy(p));
        System.out.println("With Vowels:"+m.get(true));
        System.out.println("Without Vowels:"+m.get(false));
//        m.forEach((key,list)->{
//            System.out.println(key+"-"+list);
//        });
    }
}
