package Streams.AdvancedStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseTheString {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("harsha", "sai", "vamsi krishna", "nagalakshmi", "sravani", "gayathri");
        List<String>l2=IntStream.range(0,l1.size())
                .mapToObj(i->l1.get(l1.size()-1-i))
                .collect(Collectors.toList());
        System.out.println("Reversed String is:"+l2);

    }
}
